package com.ddzj.service.impl;

import com.ddzj.entity.TblUser;
import com.ddzj.entity.TblUserRole;
import com.ddzj.repository.TblUserMapper;
import com.ddzj.service.TblUserRoleService;
import com.ddzj.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** @创建时间 2018/11/10 @描述 */
@Service
@Transactional
public class TblUserServiceImpl implements TblUserService {

  @Autowired private TblUserMapper tblUserMapper;

  @Autowired private TblUserRoleService tblUserRoleService;

  @Override
  public int updateByPrimaryKeySelective(TblUser tblUser) {

    TblUserRole tblUserRole = new TblUserRole();
    tblUserRole.setId(1);
    tblUserRole.setName("22");//432156123456789123456789
    tblUserRoleService.updateByPrimaryKeySelective(tblUserRole);

    int count =  tblUserMapper.updateByPrimaryKeySelective(tblUser);

    return count;
  }

}
