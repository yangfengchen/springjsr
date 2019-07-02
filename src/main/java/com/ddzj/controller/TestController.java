package com.ddzj.controller;

import com.ddzj.entity.UserInfo;
import com.ddzj.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@Controller
public class TestController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/testFirst")
    @ResponseBody
    public void testFirst(){
        UserInfo userInfo = userInfoService.selectByPrimaryKey(1);
        if(userInfo != null){
            System.out.println(userInfo.getName());
        }
    }

    @RequestMapping("/testOne")
    @ResponseBody
    public void testOne(){
        String name = userInfoService.selectNameById(1);
        System.out.println(name);
    }
}
