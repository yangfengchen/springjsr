package com.ddzj.service.impl;

import com.ddzj.entity.UserInfo;
import com.ddzj.repository.UserInfoMapper;
import com.ddzj.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * controller 调用 service fun1 service fun1调用service fun2
     * fun2 设置了缓存,fun1没有设置缓存 查询还是不会走缓存
     * fun返回不同类型 cacheable的 value 可以相同 key 不能相同
    **/
    @Override
    //@Cacheable(value = {"userCache"}, key = "#uid")
    //@Cacheable(value = {"userCache"})
    //@Cacheable(value = {"userCache"}, key = "#uid")
    public UserInfo selectByPrimaryKey(Integer uid) {
        System.out.println("测试11");
        return userInfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    @Cacheable(value = {"userCache"}, key = "#id+'_Name'")
    public String selectNameById(Integer id) {
        UserInfo userInfo = selectByPrimaryKey(id);
        if(userInfo != null){
            return userInfo.getName();
        }
        return "";
    }


}
