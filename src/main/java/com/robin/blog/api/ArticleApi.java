package com.robin.blog.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.robin.blog.common.Constant;
import com.robin.blog.entity.ArticleEntity;
import com.robin.blog.entity.ResponseBean;
import com.robin.blog.service.ArticleService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
public class ArticleApi {

  @Autowired
  ArticleService articleService;

  @ResponseBody
  @RequestMapping(value = "/api/addArticle", method = RequestMethod.POST)
  ResponseBean addArticle(@RequestBody ArticleEntity article) {
    ResponseBean responseBean = new ResponseBean();
    try {
      article.setDiscard(Constant.OFFLINE);
      Date date = new Date();
      article.setCreateTime(date.getTime());
      articleService.addArticle(article);
      responseBean.setSuccess(true);
      responseBean.setResult(article.getId());
    } catch (Exception e) {
      responseBean.setResult(false);
      responseBean.setErrorMsg(e.toString());
    }
    return responseBean;
  }

  @RequestMapping(value = "/api/getArticleByPage")
  ResponseBean getArticleByPage(@RequestBody Map<String, Object> map) {
    int page = (int) map.get("page");
    int pageSize = (int) map.get("pageSize");
    Object aritcle = map.get("article");
    ArticleEntity a = new ArticleEntity();

    List<ArticleEntity> list = new ArrayList<ArticleEntity>();
    ResponseBean responseBean = new ResponseBean();
    try {
      BeanUtils.populate(a, (LinkedHashMap) aritcle);
      list = articleService.getArticleByPage(page, pageSize, a);
      responseBean.setSuccess(true);
      int total = articleService.getArticleCount();
      Map<String, Object> ext = new HashMap<String, Object>();
      ext.put("total", total);
      responseBean.setExtInfo(ext);
      responseBean.setResult(list);
    } catch (Exception e) {
      responseBean.setSuccess(false);
      responseBean.setErrorMsg(e.toString());
    }
    return responseBean;
  }

  @ResponseBody
  @RequestMapping(value = "/api/updateArticleById")
  ResponseBean updateArticle(@RequestBody ArticleEntity article) {
    ResponseBean responseBean = new ResponseBean();
    Date date = new Date();
    article.setEditTime(date.getTime());
    try {
      articleService.updateArticleById(article);
      responseBean.setSuccess(true);
    } catch (Exception e) {
      responseBean.setSuccess(false);
      responseBean.setErrorMsg(e.toString());
    }
    return responseBean;
  }

  @RequestMapping(value = "/api/test")
  ResponseBean testQuery() {
    Map<String, String> obj = new HashMap<String, String>();
    obj.put("name", "robin");
    System.out.println("ROIBN");
    ResponseBean r = new ResponseBean();
    r.setResult(obj);
    return r;
  }
}
