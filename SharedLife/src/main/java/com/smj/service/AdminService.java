package com.smj.service;

import com.smj.entity.Admin;

/**
 * 管理员service接口
 * @author smj
 *
 */
public interface AdminService {

  /**
   * 根据用户名查找用户实体
   * @param userName
   * @return
   */
  public Admin findByUserNameAndPassword(String userName, String password);

  /**
   * 根据id查询管理员信息
   * @param adminId
   * @return
   */
  public Admin findById(Integer adminId);

  /**
   * 保存管理员信息
   * @param user
   */
  public void save(Admin user);
}
