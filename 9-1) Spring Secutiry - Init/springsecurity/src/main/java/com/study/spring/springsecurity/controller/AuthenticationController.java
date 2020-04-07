package com.study.spring.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {
  @GetMapping(path = {"/login"})
  public String viewLoginForm() {
    System.out.println("loginForm");
    return "loginForm";
  }
}
