package com.sduty.springmvc.vo;

import java.io.Serializable;

public class EchoForm implements Serializable {
  private static final long serialVersionUID = Long.MAX_VALUE;
  
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
