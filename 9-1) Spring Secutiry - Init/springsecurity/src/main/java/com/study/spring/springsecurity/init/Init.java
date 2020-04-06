package com.study.spring.springsecurity.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import com.study.spring.springsecurity.config.DispatcherServletContextConfig;

public class Init extends AbstractSecurityWebApplicationInitializer {
  public Init() {
    super(DispatcherServletContextConfig.class);
  }
}   
