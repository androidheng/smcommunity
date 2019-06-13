package com.smcommunity.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import com.smcommunity.mapper.TbMomentsMapper;
import com.smcommunity.mapper.TbRetypeMapper;
import com.smcommunity.pojo.TbGoods;
import com.smcommunity.pojo.TbMoments;
import com.smcommunity.pojo.TbRetype;
import com.smcommunity.pojo.TbRetypeExample;
import com.smcommunity.pojo.TbRetypeExample.Criteria;
import com.smcommunity.pojo.TbUsers;
import com.smcommunity.service.GoodsService;
import com.smcommunity.service.MomentsService;
import com.smcommunity.service.UsersService;
import com.smcommunity.utils.Config;
import com.smcommunity.utils.DateUtils;
import com.smcommunity.vo.MomentsVo;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/moments")
public class MomentsController {

	@Autowired
	private MomentsService momentsService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private TbMomentsMapper tbMomentsMapper;
	@Autowired
	private TbRetypeMapper retypeMapper;
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findTuiAll")
	public List<TbMoments> findTuiAll(String uid){
		List<TbMoments> list=new ArrayList<>();
		TbRetypeExample example=new TbRetypeExample();
		example.createCriteria().andUidEqualTo(Integer.parseInt(uid));
		List<TbRetype> list4 = retypeMapper.selectByExample(example);
		if(list4.size()>0) {
			for (TbRetype tbRetype : list4) {
				String[] split = tbRetype.getMaxtype().split(",");
				for (String str : split) {
					List<TbMoments> list3=momentsService.findRand(uid,str);
					if(list3.size()>0)
						list.addAll(list3);
				}
				
			}
		}
		return list;
	}
	@ResponseBody
	@RequestMapping("/findAll")
	public List<TbMoments> findAll(String key,String uid){
		List<TbMoments> list=null;
		if(StringUtils.isEmpty(key)) {
			list=tbMomentsMapper.findBbsNoKey();
		}else {
			list=tbMomentsMapper.findBbs(key);
		}
		List<TbMoments> list2=momentsService.findType(uid);
		for (TbMoments tbMoments : list2) {
			List<TbMoments> list3=momentsService.findRand(uid,tbMoments.getNewstype());
			if(list3.size()>0)
				list.addAll(list3);
		}
	/*	 List<TbMoments> list = momentsService.findAll(key);
		 List<MomentsVo> resultLit=new ArrayList<>();
		 List<TbGoods> goods=goodsService.findGuanGao();
		 for (TbGoods tbGoods : goods) {
			MomentsVo momentsVo=new MomentsVo();
			momentsVo.setGoodsdescribe(tbGoods.getGoodsdescribe());
			momentsVo.setGoodsname(tbGoods.getGoodsname());
			momentsVo.setGoodsimage(tbGoods.getGoodsimage());
			momentsVo.setType(1);
			resultLit.add(momentsVo);
		}
		 for (TbMoments tbMoments : list) {
			MomentsVo momentsVo=new MomentsVo();
			BeanUtils.copyProperties(tbMoments, momentsVo);
			TbUsers tbUsers = usersService.findOne(tbMoments.getUid());
			momentsVo.setNickname(tbUsers.getNickname());
			momentsVo.setHeadlogo(tbUsers.getHeadlogo());
			resultLit.add(momentsVo);
		}*/
		 
		return list;
	}
	@ResponseBody
	@RequestMapping("/findMyList")
	public List<TbMoments> findMyList(String uid){
		List<TbMoments> list = momentsService.findMyComents(Integer.parseInt(uid));
	
		return list;
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return momentsService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param moments
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Result add( TbMoments moments,MultipartFile file,HttpServletRequest request){
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
	                    moments.setLogo("upload/"+trueFileName);
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
			moments.setLoved("0");
			moments.setComments("0");
			moments.setCreatetime(DateUtils.getCurrent());
			momentsService.add(moments);
			return new Result(200, "发布成功");
			}catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "发布失败");
		}
	}
	@ResponseBody
	@RequestMapping("/addNoImage")
	public Result addNoImage( TbMoments moments){
		try {
			moments.setLoved("0");
			moments.setComments("0");
			moments.setCreatetime(DateUtils.getCurrent());
			momentsService.add(moments);
			return new Result(200, "发布成功");
			}catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "发布失败");
		}
	}
	@ResponseBody
	@RequestMapping("/findMyComents")
	public Result findMyComents(String id){
		List<TbMoments> list=momentsService.findMyComents(Integer.parseInt(id));
		return new Result(200, "",list);
	}
	
	/**
	 * 修改
	 * @param moments
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbMoments moments){
		try {
			momentsService.update(moments);
			return new Result(200, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "修改失败");
		}
	}	
	/**
	 * 点赞
	 * @param moments
	 * @return
	 */
	@RequestMapping("/updateLove")
	public Result updateLove(@RequestBody TbMoments moments){
		try {
			TbMoments tbMoments = momentsService.findOne(moments.getId());
			tbMoments.setLoved((Integer.parseInt(tbMoments.getLoved())+1)+"");
			momentsService.update(tbMoments);
			return new Result(200, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbMoments findOne(Integer id){
		return momentsService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			momentsService.delete(ids);
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
	@ResponseBody
	@RequestMapping("/search")
	public PageResult search(String key,String startdate,String enddate, int page, int rows){
		if(StringUtils.isEmpty(key)&&StringUtils.isEmpty(startdate)&&StringUtils.isEmpty(enddate)) {
			return new PageResult(0, new ArrayList<>());
		}
		return momentsService.findPage(key,startdate,enddate, page, rows);		
	}
	@ResponseBody
	@RequestMapping("/detail")
	public PageResult detail(String key,String date, int page, int rows){
		return momentsService.findPage(key,date, page, rows);		
	}
	
}
