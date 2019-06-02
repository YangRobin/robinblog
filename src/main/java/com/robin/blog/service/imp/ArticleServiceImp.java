package com.robin.blog.service.imp;

import java.util.List;
import com.robin.blog.dao.ArticleDao;
import com.robin.blog.entity.ArticleEntity;
import com.robin.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService {

  @Autowired
  ArticleDao articleDao;

  @Override
  public int addArticle(ArticleEntity articleEntity) {
    return articleDao.addArticle(articleEntity);
  }

  @Override
  public int updateArticleById(ArticleEntity articleEntity, int id) {
    return articleDao.updateArticleById(articleEntity, id);
  }

  @Override
  public List<ArticleEntity> getArticleByPage(int page, int pageSize) {
    return articleDao.getArticleByPage((page-1)*pageSize, pageSize);
  }

}