package com.dream.bean;

import com.dream.basebean.PageBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Theme extends PageBase{

	// ************
	private Integer commentcount;

	public Integer getCommentcount() {
		return commentcount;
	}

	public void setCommentcount(Integer commentcount) {
		this.commentcount = commentcount;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column theme.themeid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	private Integer themeid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column theme.themename
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	private String themename;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column theme.activityid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	private Integer activityid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column theme.themeid
	 * 
	 * @return the value of theme.themeid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public Integer getThemeid() {
		return themeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column theme.themeid
	 * 
	 * @param themeid
	 *            the value for theme.themeid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public void setThemeid(Integer themeid) {
		this.themeid = themeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column theme.themename
	 * 
	 * @return the value of theme.themename
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public String getThemename() {
		return themename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column theme.themename
	 * 
	 * @param themename
	 *            the value for theme.themename
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public void setThemename(String themename) {
		this.themename = themename == null ? null : themename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column theme.activityid
	 * 
	 * @return the value of theme.activityid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public Integer getActivityid() {
		return activityid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column theme.activityid
	 * 
	 * @param activityid
	 *            the value for theme.activityid
	 * 
	 * @mbggenerated Mon Oct 27 23:55:35 CST 2014
	 */
	public void setActivityid(Integer activityid) {
		this.activityid = activityid;
	}
}