package com.smcommunity.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.smcommunity.pojo.TbMoments;
import com.smcommunity.pojo.TbReview;
import com.smcommunity.pojo.TbUsers;
import com.smcommunity.service.MomentsService;
import com.smcommunity.service.ReviewService;
import com.smcommunity.service.UsersService;
import com.smcommunity.utils.DateUtils;
import com.smcommunity.vo.ReviewVo;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private MomentsService momentsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<ReviewVo> findAll(int cid){	
		List<ReviewVo> result=new ArrayList<>();
		List<TbReview> list = reviewService.findAll(cid);
		for (TbReview tbReview : list) {
			ReviewVo reviewVo=new ReviewVo();
			BeanUtils.copyProperties(tbReview, reviewVo);
			TbUsers tbUsers = usersService.findOne(tbReview.getUid());
			reviewVo.setNickname(tbUsers.getNickname());
			result.add(reviewVo);
		}
		return result;
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return reviewService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param review
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(TbReview review){
		try {
			review.setReviewtime(DateUtils.getCurrent());
			reviewService.add(review);
			TbMoments tbMoments = momentsService.findOne(review.getCid());
			String count=(Integer.parseInt(tbMoments.getComments())+1)+"";
			tbMoments.setComments(count);
			momentsService.update(tbMoments);
			return new Result(200, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param review
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbReview review){
		try {
			reviewService.update(review);
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
	public TbReview findOne(Integer id){
		return reviewService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			reviewService.delete(ids);
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
	public PageResult search(@RequestBody TbReview review, int page, int rows  ){
		return reviewService.findPage(review, page, rows);		
	}
	
}
