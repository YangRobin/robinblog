package com.robin.blog.dao;

import java.util.List;

import com.robin.blog.entity.ArticleEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleDao {

  public int getTotalArticle();

  public int addArticle(ArticleEntity articleEntity);

  public int updateArticleById(ArticleEntity articleEntity);

  public List<ArticleEntity> getArticleByPage(@Param("page") int page, @Param("pageSize") int pageSize,
      @Param("article") ArticleEntity article);

}