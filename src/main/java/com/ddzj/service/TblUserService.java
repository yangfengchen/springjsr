package com.ddzj.service;

import com.ddzj.entity.TblUser;

public interface TblUserService {

    int updateByPrimaryKeySelective(TblUser tblUser);
}
