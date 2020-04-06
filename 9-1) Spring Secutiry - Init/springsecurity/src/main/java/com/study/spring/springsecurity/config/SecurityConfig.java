package com.study.spring.springsecurity.config;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

  @Override
  public void configure(WebSecurity web) throws Exception {
    // TODO Auto-generated method stub
    web.ignoring().antMatchers("/resources/**");
  }
  
}
