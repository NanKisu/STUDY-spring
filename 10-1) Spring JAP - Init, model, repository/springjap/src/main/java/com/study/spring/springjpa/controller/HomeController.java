package com.study.spring.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.study.spring.springjpa.repository.MyUserRepository;

@Controller
@RequestMapping("/")
public class HomeController {
  @Autowired
  private MyUserRepository myUserRepository;
  
  @GetMapping
  public String home() {
    System.out.println("Welcome!");
    System.out.println(myUserRepository);
    System.out.println(myUserRepository.findAll());
    return "home";
  }
  
}
