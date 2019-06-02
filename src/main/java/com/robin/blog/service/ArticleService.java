package com.robin.blog.service;

import java.util.List;

import com.robin.blog.entity.ArticleEntity;

public interface ArticleService {

  /**
   * 新建文章
   * 
   * @param articleEntity
   * @return
   */
  public int addArticle(ArticleEntity articleEntity);

  /**
   * 按id更新文章
   * 
   * @param id
   * @return
   */
  public int updateArticleById(ArticleEntity articleEntity, int id);

  /**
   * 分页查询文章
   * 
   * @param page
   * @param pageSize
   * @return
   */
  public List<ArticleEntity> getArticleByPage(int page, int pageSize);

}