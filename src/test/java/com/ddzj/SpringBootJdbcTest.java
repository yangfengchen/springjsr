package com.ddzj;

/**
 * @创建时间 2018/11/10
 * @描述
 */

import com.ddzj.entity.UserInfo;
import com.ddzj.repository.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootShiroApplication.class)
@WebAppConfiguration
public class SpringBootJdbcTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testRepository(){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        if(userInfo != null){
            System.out.println(userInfo.getName());
        }
    }
}
