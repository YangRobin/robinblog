package com.robin.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

  @RequestMapping(value = "hello")
  public String helloworld() {
    return "helloworld";
  }
}