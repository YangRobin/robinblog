package com.robin.blog.service;

import java.util.List;
import com.robin.blog.bean.Test;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
  List<Test> getTest();
}