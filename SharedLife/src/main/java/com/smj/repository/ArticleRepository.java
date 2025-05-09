package com.smj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.smj.entity.Article;

/**
 * 文章Repository接口
 * @author smj
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article> {

  /**
   * n条热门文章（点击排行）
   * @param n
   * @return
   */
  @Query(value = "SELECT * FROM t_article ORDER BY click DESC LIMIT 0,?1", nativeQuery = true)
  public List<Article> getClickArticle(Integer n);

  /**
   * n条置顶原创文章（博主推荐）
   * @param n
   * @return
   */
  @Query(value = "SELECT * FROM t_article WHERE is_top=1 and is_original=1 ORDER BY publish_date DESC LIMIT 0,?1", nativeQuery = true)
  public List<Article> getRecommendArticle(Integer n);

  /**
   * 文章浏览量+1
   * @param articleId
   */
  @Modifying
  @Query(value = "UPDATE t_article SET click=click+1 WHERE article_id = ?1", nativeQuery = true)
  public void increaseClick(Integer articleId);

  /**
   * 评论数量+1
   * @param articleId
   */
  @Modifying
  @Query(value = "UPDATE t_article SET comment_num=comment_num+1 WHERE article_id = ?1", nativeQuery = true)
  public void increaseComment(Integer articleId);

  /**
   * 评论数量-1
   * @param articleId
   */
  @Modifying
  @Query(value = "UPDATE t_article SET comment_num=comment_num-1 WHERE article_id = ?1", nativeQuery = true)
  public void reduceComment(Integer articleId);

  /**
   * n条随机文章
   * @param n
   * @return
   */
  @Query(value = "SELECT * FROM t_article ORDER BY RAND() LIMIT ?1", nativeQuery = true)
  public List<Article> getRandomArticle(Integer n);

  @Query(value = "SELECT * FROM t_article WHERE user_id=?1", nativeQuery = true)
  public List<Article> findByUserId(Integer id);
}
