package com.study.spring.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
public class WebMvcConfig  extends WebMvcConfigurerAdapter{
  @Bean
  public InternalResourceViewResolver internalResourceViewResolver() {
    return new InternalResourceViewResolver("/", ".jsp");
  }
}
