package com.dream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dream.bean.Activity;
import com.dream.bean.Comment;
import com.dream.bean.Praise;
import com.dream.bean.Theme;
import com.dream.dao.ActivityMapper;
import com.dream.dao.CommentMapper;
import com.dream.dao.PraiseMapper;
import com.dream.dao.ThemeMapper;
import com.dream.service.ActivityService;

@Repository(value = "activityService")
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityMapper activityDao;
	@Autowired
	private PraiseMapper praiseDao;
	@Autowired
	private CommentMapper commentDao;
	@Autowired
	private ThemeMapper themeDao;
	
	

	@Override
	public List<Activity> listActivity(Activity activity) {

		return activityDao.listActivity(activity);
	}

	@Override
	public Activity detailActivity(Activity activity) {
		//先从数据库中查询出该跳记录的详细信息
		activity = activityDao.detailActivity(activity);
		int commentCount = 0;
		int praiseCount = 0;
		int caredegree = 0;
		//计算评论数量
		//先计算该活动所拥有的话题，然后分别计算每个话题下有多少个评论
		Theme theme = new Theme();
		theme.setActivityid(activity.getActivityid());
		Comment comment = new Comment();
		for(Theme themeTmp : themeDao.listTheme(theme)){
			comment.setThemeid(themeTmp.getThemeid());
			commentCount+=commentDao.countComment(comment);
		}
		//计算点赞数量
		Praise praise = new Praise();
		praise.setPraiseidactivityid(activity.getActivityid());
		praiseCount = praiseDao.countPraise(praise);

		//计算关注度 TOOD 关注度暂时仅仅使用评论的50%+点赞的50%
		caredegree = (int) (commentCount * 1.0 / 2 + praiseCount * 1.0 / 2);
		
		
		activity.setCommentCount(commentCount);
		activity.setPraiseCount(praiseCount);
		activity.setCaredegree(caredegree);
		
		return activity;
	}

	@Override
	public int updateActivity(Activity activity) {

		return activityDao.updateByPrimaryKeySelective(activity);
	}

	@Override
	public int deleteActivity(int uid) {

		return activityDao.deleteByPrimaryKey(uid);

	}

	@Override
	public int addActivity(Activity activity) {

		return activityDao.insert(activity);

	}

	@Override
	public int countActivity(Activity activity) {
		
		return activityDao.countActivity(activity);
		
	}

}