package com.smcommunity.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.smcommunity.pojo.TbTwoinfo;
import com.smcommunity.service.TwoinfoService;
import com.smcommunity.utils.DateUtils;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/twoinfo")
public class TwoinfoController {

	@Autowired
	private TwoinfoService twoinfoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll")
	public List<TbTwoinfo> findAll(){			
		return twoinfoService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return twoinfoService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param twoinfo
	 * @return
	 */
	/*@RequestMapping("/add")
	public Result add(@RequestBody TbTwoinfo twoinfo){
		try {
			twoinfoService.add(twoinfo);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}*/
	@ResponseBody
	@RequestMapping("/add")
	public Result add(MultipartFile image,HttpServletRequest request){
		try {
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			String uid=request.getParameter("uid");
			TbTwoinfo twoinfo=new TbTwoinfo();
			twoinfo.setTitle(title);
			twoinfo.setContent(content);
			twoinfo.setCreatetime(DateUtils.getCurrent());
			System.out.println("测试二手");
			if (image!=null) {// 判断上传的文件是否为空
	            String path=null;// 文件路径
	            String type=null;// 文件类型
	            String fileName=image.getOriginalFilename();// 文件原名称
	            System.out.println("上传的文件原名称:"+fileName);
	            // 判断文件类型
	            type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
	            if (type!=null) {// 判断文件类型是否为空
	                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
	                    // 项目在容器中实际发布运行的根路径
	                    String realPath=request.getSession().getServletContext().getRealPath("upload/");
	                    // 自定义的文件名称
	                    String trueFileName=String.valueOf(System.currentTimeMillis())+fileName.substring(fileName.indexOf("."));
	                    twoinfo.setImage("http://192.168.3.57:8080/upload/"+trueFileName);
	                    // 设置存放图片文件的路径
	                    path=realPath+File.separator+trueFileName;
	                    System.out.println("存放图片文件的路径:"+path);
	                    // 转存文件到指定的路径
	                    try {
	                    	image.transferTo(new File(path));
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
			twoinfoService.add(twoinfo);
			System.out.println(twoinfo);
			return new Result(200, "发布成功");
			}catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "发布失败");
		}
	}	
	/**
	 * 修改
	 * @param twoinfo
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTwoinfo twoinfo){
		try {
			twoinfoService.update(twoinfo);
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
	public TbTwoinfo findOne(Integer id){
		return twoinfoService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			twoinfoService.delete(ids);
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
	public PageResult search(@RequestBody TbTwoinfo twoinfo, int page, int rows  ){
		return twoinfoService.findPage(twoinfo, page, rows);		
	}
	
}
