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
import com.smcommunity.pojo.TbShop;
import com.smcommunity.service.ShopService;
import com.smcommunity.utils.DateUtils;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	private ShopService shopService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbShop> findAll(){			
		return shopService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return shopService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param shop
	 * @return
	 */
	@RequestMapping(value="/addOrUpdate",produces = "application/json;charset=UTF-8")
	public String addOrUpdate( TbShop shop,MultipartFile file,HttpServletRequest request){
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
	                   // shop.setLogo("upload/"+trueFileName);
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
			//moments.setLoved("0");
			//moments.setComments("0");
			//moments.setCreatetime(DateUtils.getCurrent());
			shopService.add(shop);
			return "商品添加成功";
			}catch (Exception e) {
			e.printStackTrace();
			return "商品添加失败";
		}
	}
	
	/**
	 * 修改
	 * @param shop
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbShop shop){
		try {
			shopService.update(shop);
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
	public TbShop findOne(Integer id){
		return shopService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			shopService.delete(ids);
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
	public PageResult search(@RequestBody TbShop shop, int page, int rows  ){
		return shopService.findPage(shop, page, rows);		
	}
	
}
