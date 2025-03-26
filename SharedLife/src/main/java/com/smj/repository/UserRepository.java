package com.smj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smj.entity.User;

/**
 * 用户Repository接口
 * @author smj
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

  /**
   * 根据open_id查找用户
   * @param openId
   * @return
   */
  @Query(value = "select * from t_user where open_id=?1 limit 1", nativeQuery = true)
  public User findByOpenId(String openId);

  /**
   * 根据真实姓名模糊查询用户ID
   * @param trueName
   * @return
   */
  @Query(value = "select user_id from t_user where nickname like %:nickname%", nativeQuery = true)
  public Integer getUserIdByTrueName(@Param("nickname") String nickname);

  public User findByUsernameAndPassword(String username, String password);

  public User findByNickname(String username);
}
