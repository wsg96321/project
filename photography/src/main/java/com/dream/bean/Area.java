package com.dream.bean;

public class Area extends BaseBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.areaid
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    private Integer areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.areaname
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    private String areaname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.areaid
     *
     * @return the value of area.areaid
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.areaid
     *
     * @param areaid the value for area.areaid
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.areaname
     *
     * @return the value of area.areaname
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.areaname
     *
     * @param areaname the value for area.areaname
     *
     * @mbggenerated Tue Sep 23 17:45:35 CST 2014
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }
}