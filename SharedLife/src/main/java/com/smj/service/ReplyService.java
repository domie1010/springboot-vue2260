package com.smj.service;

import java.util.List;

import com.smj.entity.Reply;

/**
 * 回复Service接口
 * @author smj
 *
 */
public interface ReplyService {

	/**
	 * 获取回复
	 * @param reply
	 * @return
	 */
	public List<Reply> list(Reply reply);
	
	/**
	 * 分页查询回复
	 * @param reply
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Reply> list(Reply reply,Integer page,Integer pageSize);
	
	
	/**
	 * 获取总记录数
	 * @return
	 */
	public Long getCount();
	
	/**
	 * 添加回复
	 * @param reply
	 */
	public void add(Reply reply);
	
	/**
	 * 删除回复
	 * @param id
	 */
	public void delete(Integer id);
	
}
