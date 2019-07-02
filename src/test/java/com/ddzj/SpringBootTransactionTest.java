package com.ddzj;

import com.ddzj.entity.TblUser;
import com.ddzj.service.TblUserRoleService;
import com.ddzj.service.TblUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/** @创建时间 2018/11/10 @描述 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootShiroApplication.class)
@WebAppConfiguration
public class SpringBootTransactionTest {

    @Autowired
    private TblUserService tblUserService;
    @Autowired
    private TblUserRoleService tblUserRoleService;


  @Test
  public void testTransaction() {
      TblUser tblUser = new TblUser();
      tblUser.setId(1);
      tblUser.setName("张三1234567891234567891234566");
      tblUserService.updateByPrimaryKeySelective(tblUser);
  }
}
