package com.robin.blog.dao;

import java.util.List;
import com.robin.blog.bean.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
   List<Test> getTest();
}