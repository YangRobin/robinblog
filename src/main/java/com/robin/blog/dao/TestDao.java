package com.robin.blog.dao;

import java.util.List;
import com.robin.blog.bean.Test;
// import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface TestDao {
  public List<Test> getTest();
}