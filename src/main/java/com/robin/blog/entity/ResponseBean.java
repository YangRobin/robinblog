package com.robin.blog.entity;

import java.util.Map;

public class ResponseBean {

  private boolean success;
  private Object result;
  private String errorMsg;
  private Map<String, Object> extInfo;

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public Map<String, Object> getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(Map<String, Object> extInfo) {
    this.extInfo = extInfo;
  }

}