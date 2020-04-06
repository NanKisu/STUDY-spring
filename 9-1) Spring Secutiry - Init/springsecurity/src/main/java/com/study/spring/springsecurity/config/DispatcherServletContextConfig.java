package com.study.spring.springsecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration

@ComponentScan(basePackages = {"com.study.spring.springsecurity"})
@Import(value = {WebMvcConfig.class})
public class DispatcherServletContextConfig{

}
