package com.robin.blog.api;

import com.robin.blog.entity.ArticleEntity;
import com.robin.blog.entity.ResponseBean;
import com.robin.blog.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleApi {

  @Autowired
  ArticleService articleService;

  ResponseBean addArticle(ArticleEntity articleEntity) {
    ResponseBean responseBean = new ResponseBean();
    responseBean.setResult(articleService.addArticle(articleEntity));
    return responseBean;
  }
}