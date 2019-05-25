package com.robin.blog.dao;

import java.util.List;

import com.robin.blog.entity.ArticleEntity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleDao {
  
  public int addArticle(ArticleEntity articleEntity);

  public int updateArticleById(ArticleEntity articleEntity, int id);

  public List<ArticleEntity> getArticleByPage(int page, int pageSize ,ArticleEntity articleEntity);

}