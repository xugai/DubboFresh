package com.imooc.one.dubbo.module.mapper;

import com.imooc.one.dubbo.module.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Sat Jun 01 21:27:41 GMT+08:00 2019
     */
    int updateByPrimaryKey(Product record);

    List<Product> selectAll();

    List<Product> selectByKeyWord(@Param("keyWord") String keyWord);
}