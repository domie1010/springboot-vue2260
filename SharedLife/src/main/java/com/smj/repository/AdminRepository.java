package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.smj.entity.Admin;

/**
 * 用户Repository接口
 * @author smj
 *
 */
public interface AdminRepository extends JpaRepository<Admin, Integer>,JpaSpecificationExecutor<Admin> {

	
	public Admin findByUserNameAndPassword(String userName,String password);
}
