package com.dream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dream.bean.Comment;
import com.dream.bean.Theme;
import com.dream.dao.CommentMapper;
import com.dream.dao.ThemeMapper;
import com.dream.service.ThemeService;

@Repository(value = "themeService")
public class ThemeServiceImpl implements ThemeService {

	@Autowired
	private ThemeMapper themeDao;
	@Autowired
	private CommentMapper commentDao;
	
	@Override
	public List<Theme> listTheme(Theme theme) {

		return themeDao.listTheme(theme);
	}

	@Override
	public Theme detailTheme(Theme theme) {

		return themeDao.detailTheme(theme);
	}

	@Override
	public int updateTheme(Theme theme) {

		return themeDao.updateByPrimaryKeySelective(theme);
	}

	@Override
	public int deleteTheme(int uid) {

		return themeDao.deleteByPrimaryKey(uid);

	}

	@Override
	public int addTheme(Theme theme) {

		return themeDao.insert(theme);

	}

	@Override
	public int countTheme(Theme theme) {
		
		return themeDao.countTheme(theme);
	}

	@Override
	public List<Theme> listThemeInclueCommentCount(Theme theme) {
		
		List<Theme> themeList = themeDao.listTheme(theme);
		Comment comment = new Comment();
		//遍历每个话题的评论总数
		for (Theme themeTemp : themeList) {
			comment.setThemeid(themeTemp.getThemeid());
			themeTemp.setCommentcount(commentDao.countComment(comment)); 			
		}
		
		return themeList;
	}

}
