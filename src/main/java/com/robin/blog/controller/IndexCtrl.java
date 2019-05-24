package com.robin.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCtrl {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }

  @RequestMapping(value = "/admin")
  public String admin() {
    return "admin";
  }

  // @RequestMapping(value = "/error")
  // public String error() {
  //   return "error";
  // }
}