package com.dream.dao;

import java.util.List;

import com.dream.bean.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    User selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 28 19:23:13 CST 2014
     */
    int updateByPrimaryKey(User record);
    
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
	
	/**
	 * 根据条件统计记录数
	 * @param user
	 * @return
	 */
	int countUser(User user);
	/**
	 * 根据传入的手机号去更新其他字段
	 * @param user
	 * @return
	 */
	int updateByTelephone(User user);
}