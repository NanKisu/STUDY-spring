
package com.study.spring.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

  @Override
  public void configure(WebSecurity web) throws Exception {
    // TODO Auto-generated method stub
    web.ignoring().antMatchers("/resources");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // TODO Auto-generated method stub
    http.formLogin().loginPage("/login").loginProcessingUrl("/authenticate").usernameParameter("uid").passwordParameter("pwd").permitAll();
    http.formLogin().defaultSuccessUrl("/").permitAll();
    http.formLogin().failureForwardUrl("/loginfailure").permitAll();
    http.authorizeRequests().anyRequest().authenticated();
  }
  
}