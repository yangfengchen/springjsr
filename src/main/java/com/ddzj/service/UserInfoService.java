package com.ddzj.service;

import com.ddzj.entity.UserInfo;

public interface UserInfoService {

    UserInfo selectByPrimaryKey(Integer uid);

    String selectNameById(Integer id);
}
