package com.dream.bean;

import com.dream.basebean.PageBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Userinfo extends PageBase{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userid
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.telephone
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.email
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.company
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.department
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    private String department;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userid
     *
     * @return the value of userinfo.userid
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userid
     *
     * @param userid the value for userinfo.userid
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.telephone
     *
     * @return the value of userinfo.telephone
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.telephone
     *
     * @param telephone the value for userinfo.telephone
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.email
     *
     * @return the value of userinfo.email
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.email
     *
     * @param email the value for userinfo.email
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.company
     *
     * @return the value of userinfo.company
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.company
     *
     * @param company the value for userinfo.company
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.department
     *
     * @return the value of userinfo.department
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.department
     *
     * @param department the value for userinfo.department
     *
     * @mbggenerated Mon Oct 27 23:55:35 CST 2014
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}