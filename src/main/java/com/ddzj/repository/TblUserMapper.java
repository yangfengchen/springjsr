package com.ddzj.repository;

import com.ddzj.entity.TblUser;

public interface TblUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    int insert(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    int insertSelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    TblUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    int updateByPrimaryKeySelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    int updateByPrimaryKey(TblUser record);
}