package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smj.entity.Reply;

/**
 * 回复Repository接口
 * @author smj
 *
 */
public interface ReplyRepository extends JpaRepository<Reply, Integer>,JpaSpecificationExecutor<Reply> {

}
