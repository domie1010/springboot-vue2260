package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Link;

/**
 * 友情链接Repository接口
 * @author smj
 *
 */
public interface LinkRepository extends JpaRepository<Link, Integer>,JpaSpecificationExecutor<Link> {

	
}
