package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Blogger;

/**
 * 博主Repository接口
 * @author smj
 *
 */
public interface BloggerRepository extends JpaRepository<Blogger, Integer>,JpaSpecificationExecutor<Blogger> {

	
}
