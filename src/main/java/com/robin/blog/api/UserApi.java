package com.robin.blog.api;

import java.util.List;

import com.robin.blog.entity.ResponseBean;
import com.robin.blog.entity.Test;
import com.robin.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserApi {
  @Autowired
  TestService testService;

  // @Value("${robin.msg}")
  // private String msg;
  @ResponseBody
  @RequestMapping(value = "/hello")
  public ResponseBean helloworld() {
    List<Test> Tests = testService.getTest();
    // System.out.println(msg);
    ResponseBean responseBean = new ResponseBean();
    responseBean.setSuccess(true);
    responseBean.setResult(Tests);
    return responseBean;
  }

  
}