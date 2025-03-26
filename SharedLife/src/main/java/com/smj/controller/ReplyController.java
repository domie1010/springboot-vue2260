package com.smj.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smj.entity.Reply;
import com.smj.entity.User;
import com.smj.service.ReplyService;

/**
 * 回复控制器
 * @author smj
 *
 */
@RestController
@RequestMapping("/reply")
public class ReplyController {

  @Resource
  private ReplyService replyService;

  /**
   * 获取回复
   * @param reply
   * @return
   */
  @RequestMapping("/list")
  public Map<String, Object> replyList(Reply reply) {
    List<Reply> replyList = replyService.list(reply);
    Map<String, Object> resultMap = new HashMap<String, Object>();
    resultMap.put("data", replyList);
    return resultMap;
  }

  /**
   * 添加回复
   * @param reply
   * @return
   */
  @RequestMapping("/add")
  public Map<String, Object> add(Reply reply, HttpSession session) {
    User currentUser = (User) session.getAttribute("user");
    Map<String, Object> resultMap = new HashMap<String, Object>();
    reply.setReplyDate(new Date());
    reply.setUser(currentUser);
    replyService.add(reply);
    resultMap.put("reply", reply);
    resultMap.put("success", true);
    return resultMap;
  }

}
