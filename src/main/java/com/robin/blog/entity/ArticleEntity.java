package com.robin.blog.entity;

public class ArticleEntity {
  private int id;
  private String title;
  private String content;
  private String avator;
  private int createTime;
  private int editTime;
  private int viewTimes;
  private int stars;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAvator() {
    return avator;
  }

  public void setAvator(String avator) {
    this.avator = avator;
  }

  public int getCreateTime() {
    return createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
  }

  public int getEditTime() {
    return editTime;
  }

  public void setEditTime(int editTime) {
    this.editTime = editTime;
  }

  public int getViewTimes() {
    return viewTimes;
  }

  public void setViewTimes(int viewTimes) {
    this.viewTimes = viewTimes;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

}