package com.smcommunity.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.smcommunity.mapper.TbGoodsuserMapper;
import com.smcommunity.mapper.TbTypecountMapper;
import com.smcommunity.pojo.TbGoods;
import com.smcommunity.pojo.TbGoodsuser;
import com.smcommunity.pojo.TbType;
import com.smcommunity.pojo.TbTypecount;
import com.smcommunity.pojo.TbTypecountExample;
import com.smcommunity.pojo.TbTypecountExample.Criteria;
import com.smcommunity.pojo.TbUsers;
import com.smcommunity.service.GoodsService;
import com.smcommunity.service.TypeService;
import com.smcommunity.service.UsersService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private TbTypecountMapper tbTypecountMapper;
	@Autowired
	private TbGoodsuserMapper tbGoodsuserMapper;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbGoods> findAll(){			
		return goodsService.findAll();
	}
	@RequestMapping("/findShouAll")
	public List<TbGoods> findShouAll(){			
		return goodsService.findShouAll();
	}
	@RequestMapping("/recommendAll")
	public List<TbGoods> recommendAll(String uid){			
		return goodsService.recommendAll(uid);
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return goodsService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param goods
	 * @return
	 */
	@RequestMapping(value="/addOrUpdate",produces = "application/json;charset=UTF-8")
	public String  addOrUpdate( TbGoods goods,MultipartFile file,HttpServletRequest request){
		try {
			if (file!=null) {// 判断上传的文件是否为空
	            String path=null;// 文件路径
	            String type=null;// 文件类型
	            String fileName=file.getOriginalFilename();// 文件原名称
	            System.out.println("上传的文件原名称:"+fileName);
	            // 判断文件类型
	            type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
	            if (type!=null) {// 判断文件类型是否为空
	                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
	                    // 项目在容器中实际发布运行的根路径
	                    String realPath=request.getSession().getServletContext().getRealPath("upload/");
	                    // 自定义的文件名称
	                    String trueFileName=String.valueOf(System.currentTimeMillis())+fileName.substring(fileName.indexOf("."));
	                    goods.setGoodsimage("upload/"+trueFileName);
	                    // 设置存放图片文件的路径
	                    path=realPath+File.separator+trueFileName;
	                    System.out.println("存放图片文件的路径:"+path);
	                    // 转存文件到指定的路径
	                    try {
							file.transferTo(new File(path));
						} catch (IllegalStateException e) {
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                    System.out.println("文件成功上传到指定目录下");
	                }else {
	                    System.out.println("不是我们想要的文件类型,请按要求重新上传");
	                    return null;
	                }
	            }else {
	                System.out.println("文件类型为空");
	                return null;
	            }
			
			} 
			
			goods.setDisplay(0);
			TbType tbType = typeService.findOne(goods.getTid());
			goods.setTname(tbType.getTypename());
			if(goods.getGoodstype().equals(1)) {
				if(goods.getIsall().equals(0)) {
					String etypename = tbType.getEtypename();
					TbTypecountExample example=new TbTypecountExample();
					Criteria criteria = example.createCriteria();
					if(etypename.equals("food")) {
						criteria.andFoodGreaterThan(0d);
					}else if(etypename.equals("electronics")) {
						criteria.andElectronicsGreaterThan(0d);
					}else if(etypename.equals("everyday")) {
						criteria.andEverydayGreaterThan(0d);
					}else if(etypename.equals("book")) {
						criteria.andBookGreaterThan(0d);
					}else if(etypename.equals("clothing")) {
						criteria.andClothingGreaterThan(0d);
					}else if(etypename.equals("fresh")) {
						criteria.andFreshGreaterThan(0d);
					}
					
					goodsService.add(goods);
					List<TbTypecount> list = tbTypecountMapper.selectByExample(example);
					for (TbTypecount tbTypecount : list) {
						TbGoodsuser record=new TbGoodsuser();
						record.setGid(goods.getId());
						record.setUid(tbTypecount.getUid());
						tbGoodsuserMapper.insert(record);
					}
				}else {
					goodsService.add(goods);
					List<TbUsers> list = usersService.findAll();
					for (TbUsers tbUsers : list) {
						TbGoodsuser record=new TbGoodsuser();
						record.setGid(goods.getId());
						record.setUid(tbUsers.getId());
						tbGoodsuserMapper.insert(record);
					}
				}
			}else {
				goodsService.add(goods);
			}
			
			
			 return "商品添加成功";
			}catch (Exception e) {
			e.printStackTrace();
			return "商品添加失败";
		}
		
	}
	
	/**
	 * 修改
	 * @param goods
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbGoods goods){
		try {
			goodsService.update(goods);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbGoods findOne(Integer id){
		return goodsService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer  id){
		try {
			goodsService.delete(id);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(String key,Integer goodstype , int page, int rows  ){
		System.out.println("type="+goodstype);
		TbGoods goods=null;
		if(!StringUtils.isEmpty(key)||!StringUtils.isEmpty(goodstype)){
			goods=new TbGoods();
			goods.setGoodsname(key);
			goods.setGoodstype(goodstype);
		}
		return goodsService.findPage(goods, page, rows);		
	}
	
}
