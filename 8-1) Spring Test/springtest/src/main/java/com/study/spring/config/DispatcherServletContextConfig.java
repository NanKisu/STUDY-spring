package com.study.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.study.spring.controller"})
public class DispatcherServletContextConfig extends WebMvcConfigurerAdapter{
  @Bean
  public InternalResourceViewResolver internalResourceViewResolver() {
    return new InternalResourceViewResolver("/", ".jsp");
  }
}
