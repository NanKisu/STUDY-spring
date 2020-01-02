package com.sduty.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.sduty.springmvc.controller")
public class WebMvcConfig extends WebMvcConfigurerAdapter{

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    // TODO Auto-generated method stub
    registry.jsp();
  }
  
}
