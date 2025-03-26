package com.smj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smj.entity.Admin;
import com.smj.repository.AdminRepository;
import com.smj.service.AdminService;

/**
 * 管理员service接口实现类
 * @author smj
 *
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

  @Resource
  private AdminRepository adminRepository;

  @Override
  public Admin findByUserNameAndPassword(String userName, String password) {
    return adminRepository.findByUserNameAndPassword(userName, password);
  }

  @Override
  public Admin findById(Integer adminId) {
    return adminRepository.findById(adminId).orElse(null);
  }

  @Override
  public void save(Admin user) {
    adminRepository.save(user);

  }

}
