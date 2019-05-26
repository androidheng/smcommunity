package com.smcommunity.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import com.smcommunity.pojo.TbUsers;
import com.smcommunity.service.UsersService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbUsers> findAll(){			
		return usersService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return usersService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param users
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbUsers users){
		try {
			usersService.add(users);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	/**
	 * 登录
	 * @param 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login")
	public Result login( String phone,String password){
		try {
			TbUsers users=new TbUsers();
			System.out.println(password);
			System.out.println(phone);
			users.setPhone(phone);
			users.setPassword(password);
			TbUsers loginUser=usersService.login(users);
			if(loginUser!=null){
				return new Result(200, "登录成功",loginUser);
			}else{
				return new Result(201, "登录失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "登录失败");
		}
	}
	/**
	 * 修改
	 * @param users
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result update( TbUsers users,MultipartFile file,HttpServletRequest request){
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
	                    users.setHeadlogo("upload/"+trueFileName);
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
			usersService.update(users);
			System.out.println(users);
			return new Result(200, "修改成功",users);
			}catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "修改失败");
		}
	}	
	@ResponseBody
	@RequestMapping("/updateNoImage")
	public Result updateNoImage( TbUsers users){
		try {
			usersService.update(users);
			return new Result(200, "修改成功",usersService.findOne(users.getId()));
		}catch (Exception e) {
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
	public TbUsers findOne(Integer id){
		return usersService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			usersService.delete(ids);
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
	public PageResult search(String key , int page, int rows  ){
		TbUsers users=null;
		if(!StringUtils.isEmpty(key)){
			users=new TbUsers();
			users.setName(key);
		}
		return usersService.findPage(users, page, rows);		
	}
	
}
