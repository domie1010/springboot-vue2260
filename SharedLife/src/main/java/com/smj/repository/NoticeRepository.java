package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Notice;

/**
 * 公告Repository接口
 * @author smj
 *
 */
public interface NoticeRepository extends JpaRepository<Notice, Integer>,JpaSpecificationExecutor<Notice> {

	
}
