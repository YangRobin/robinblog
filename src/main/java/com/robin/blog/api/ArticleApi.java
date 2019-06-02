package com.robin.blog.api;

import java.util.ArrayList;
import java.util.List;
import com.robin.blog.entity.ArticleEntity;
import com.robin.blog.entity.ResponseBean;
import com.robin.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

  @RequestMapping(value = "/api/getArticleByPage")
  ResponseBean getArticleByPage(int page, int pageSize) {
    List<ArticleEntity> list = new ArrayList<ArticleEntity>();
    ResponseBean responseBean = new ResponseBean();
    try {
      list = articleService.getArticleByPage(page, pageSize);
      responseBean.setSuccess(true);
      responseBean.setResult(list);
    } catch (Exception e) {
      // TODO: handle exception
      responseBean.setSuccess(false);
      responseBean.setErrorMsg(e.toString());
    }
    return responseBean;
  }

}