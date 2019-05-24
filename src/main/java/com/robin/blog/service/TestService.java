package com.robin.blog.service;

import java.util.List;
import com.robin.blog.entity.Test;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
  List<Test> getTest();
}