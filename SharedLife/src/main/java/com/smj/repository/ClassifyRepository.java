package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Classify;

/**
 * 文章类别实体
 * @author smj
 *
 */
public interface ClassifyRepository extends JpaRepository<Classify, Integer>,JpaSpecificationExecutor<Classify> {
	
}
