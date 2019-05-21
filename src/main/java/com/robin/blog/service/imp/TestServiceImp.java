package com.robin.blog.service.imp;

import java.util.List;
import com.robin.blog.bean.Test;
import com.robin.blog.dao.TestDao;
import com.robin.blog.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {

  @Autowired
  TestDao testDao;

  @Override
  public List<Test> getTest() {
    return testDao.getTest();
  }

}