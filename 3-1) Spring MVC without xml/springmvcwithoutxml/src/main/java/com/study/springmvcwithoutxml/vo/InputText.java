package com.study.springmvcwithoutxml.vo;

public class InputText {
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "InputText [text=" + text + "]";
  }
}
