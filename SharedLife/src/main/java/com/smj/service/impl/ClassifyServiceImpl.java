package com.smj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smj.entity.Classify;
import com.smj.repository.ClassifyRepository;
import com.smj.service.ClassifyService;

/**
 * 文章类别service接口实现类
 * 
 * @author smj
 *
 */
@Service("classifyService")
@Transactional
public class ClassifyServiceImpl implements ClassifyService {

  @Resource
  private ClassifyRepository classifyRepository;

  @Override
  public List<Classify> list(Integer page, Integer pageSize) {
    // TODO Auto-generated method stub
    return classifyRepository.findAll(PageRequest.of(page, pageSize, Sort.Direction.ASC, "classifyId")).getContent();
  }

  @Override
  public Long getCount() {
    return classifyRepository.count();
  }

  @Override
  public Classify findById(Integer id) {
    // TODO Auto-generated method stub
    return classifyRepository.getOne(id);
  }

  @Override
  public void save(Classify classify) {
    // TODO Auto-generated method stub
    classifyRepository.save(classify);
  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub
    classifyRepository.deleteById(id);
  }

  @Override
  public List<Classify> findAll() {
    return classifyRepository.findAll();
  }

}
