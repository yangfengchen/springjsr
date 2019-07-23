package com.ddzj.controller;

import com.ddzj.entity.UserInfo;
import com.ddzj.service.UserInfoService;
import com.ddzj.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

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

    @RequestMapping("/testvailIndex")
    public String testvailIndex(){
        return "testvailIndex";
    }

    @RequestMapping("/testvailData")
    public String testvailData(@Valid UserVo userVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            System.out.println("Code:"+fieldError.getCode()+", object:"+fieldError.getObjectName()
                    +", field:"+fieldError.getField()+",message:"+fieldError.getDefaultMessage());
        }
        return "testvailData";
    }

}
