package com.robin.blog.entity;

public class ArticleEntity {
  private int id;
  private String title;
  private String content;
  private String avator;
  private long createTime;
  private long editTime;
  private long viewTimes;
  private long stars;
  private int discard;

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

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }

  public long getEditTime() {
    return editTime;
  }

  public void setEditTime(long editTime) {
    this.editTime = editTime;
  }

  public long getViewTimes() {
    return viewTimes;
  }

  public void setViewTimes(long viewTimes) {
    this.viewTimes = viewTimes;
  }

  public long getStars() {
    return stars;
  }

  public void setStars(long stars) {
    this.stars = stars;
  }

  public int getDiscard() {
    return discard;
  }

  public void setDiscard(int discard) {
    this.discard = discard;
  }

}