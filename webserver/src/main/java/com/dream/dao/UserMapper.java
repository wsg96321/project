package com.dream.dao;

import java.util.List;

import com.dream.bean.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
	String deleteByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
	String insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
	String insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    User selectByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    String updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    String updateByPrimaryKey(User record);
    

	// ******************add by wsg**********************

	/**
	 * 根据条件查询，返回一个list
	 * 
	 * @param user
	 * @return
	 */
	List<User> listUser(User user);

	/**
	 * 根据条件查询，返回一个对象
	 * 
	 * @param user
	 * @return
	 */
	User detailUser(User user);
}