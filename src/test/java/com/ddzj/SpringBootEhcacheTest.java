package com.ddzj;

import com.ddzj.entity.UserInfo;
import com.ddzj.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootShiroApplication.class)
@WebAppConfiguration
public class SpringBootEhcacheTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testFirst(){
        UserInfo userInfo = userInfoService.selectByPrimaryKey(1);
        if(userInfo != null){
            System.out.println(userInfo.getName());
        }
        UserInfo userInfo1 = userInfoService.selectByPrimaryKey(1);
        if(userInfo1 != null){
            System.out.println(userInfo1.getName());
        }
    }

    @Test
    public void testOne(){
        String name = userInfoService.selectNameById(1);
        System.out.println(name);
        name = userInfoService.selectNameById(1);
        System.out.println(name);
    }
}
