package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.smj.entity.Comment;

/**
 * 评论Repository接口
 * @author smj
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Integer>,JpaSpecificationExecutor<Comment> {

	/**
	 * 根据评论Id获取文章Id
	 * @param commentId
	 * @return
	 */
	@Query(value="select article_id from t_comment where comment_id=?1",nativeQuery=true)
	public Integer getArticleId(Integer commentId);
}
