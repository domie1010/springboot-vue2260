package com.smj.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smj.entity.Blogger;
import com.smj.repository.BloggerRepository;
import com.smj.service.BloggerService;

/**
 * 博主Service接口实现类
 * @author smj
 *
 */
@Service("bloggerService")
@Transactional
public class BloggerServiceImpl implements BloggerService {

	@Resource
	private BloggerRepository bloggerRepository;

	@Override
	public Blogger find() {
		// TODO Auto-generated method stub
		return bloggerRepository.findAll().get(0);
	}

	@Override
	public void save(Blogger blogger) {
		// TODO Auto-generated method stub
		bloggerRepository.save(blogger);
	}
	

}
