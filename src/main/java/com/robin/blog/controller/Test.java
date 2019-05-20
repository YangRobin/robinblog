package com.robin.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

  // @Value("${robin.msg}")
  // private String msg;

  @RequestMapping(value = "hello")
  public String helloworld() {
    // System.out.println(msg);
    return "helloworld";
  }
}