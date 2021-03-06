package com.dream.dao;

import java.util.List;

import com.dream.bean.Kinds;

public interface KindsMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	int deleteByPrimaryKey(Integer kindsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	int insert(Kinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	int insertSelective(Kinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	Kinds selectByPrimaryKey(Integer kindsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	int updateByPrimaryKeySelective(Kinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table kinds
	 * 
	 * @mbggenerated Tue Sep 23 17:45:35 CST 2014
	 */
	int updateByPrimaryKey(Kinds record);

	// ******************add by wsg**********************
	/**
	 * 根据条件返回一个对象
	 * 
	 * @param kinds
	 * @return
	 */
	Kinds detailKinds(Kinds kinds);

	/**
	 * 根据条件返回一个list
	 * 
	 * @param kinds
	 * @return
	 */
	List<Kinds> listKinds(Kinds kinds);
}