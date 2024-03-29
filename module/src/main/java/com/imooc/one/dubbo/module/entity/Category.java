package com.imooc.one.dubbo.module.entity;

import java.util.Date;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.parent_id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.name
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.status
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.sort_order
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Integer sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.create_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_category.update_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.id
     *
     * @return the value of mmall_category.id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.id
     *
     * @param id the value for mmall_category.id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.parent_id
     *
     * @return the value of mmall_category.parent_id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.parent_id
     *
     * @param parentId the value for mmall_category.parent_id
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.name
     *
     * @return the value of mmall_category.name
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.name
     *
     * @param name the value for mmall_category.name
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.status
     *
     * @return the value of mmall_category.status
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.status
     *
     * @param status the value for mmall_category.status
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.sort_order
     *
     * @return the value of mmall_category.sort_order
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.sort_order
     *
     * @param sortOrder the value for mmall_category.sort_order
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.create_time
     *
     * @return the value of mmall_category.create_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.create_time
     *
     * @param createTime the value for mmall_category.create_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_category.update_time
     *
     * @return the value of mmall_category.update_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_category.update_time
     *
     * @param updateTime the value for mmall_category.update_time
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}