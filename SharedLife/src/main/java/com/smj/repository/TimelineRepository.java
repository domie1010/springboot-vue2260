package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Timeline;

/**
 *时光轴Repository接口
 * @author smj
 *
 */
public interface TimelineRepository extends JpaRepository<Timeline, Integer>,JpaSpecificationExecutor<Timeline> {

	
}
