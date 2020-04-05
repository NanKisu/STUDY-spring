package com.study.spring.springsecurity.init;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import com.study.spring.springsecurity.config.AppContextConfig;
import com.study.spring.springsecurity.config.DispatcherServletContextConfig;

public class Init implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    // TODO Auto-generated method stub
    addListener(servletContext);
    addServlet(servletContext);
    addFilter(servletContext);
  }

  public void addListener(ServletContext servletContext) {
    AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
    appContext.register(AppContextConfig.class);
    ContextLoaderListener listener = new ContextLoaderListener(appContext);
    servletContext.addListener(listener);
  }

  public void addServlet(ServletContext servletContext) {
    AnnotationConfigWebApplicationContext dispatcherServletContext = new AnnotationConfigWebApplicationContext();
    dispatcherServletContext.register(DispatcherServletContextConfig.class);
    DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherServletContext);
    ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", dispatcherServlet);
    myServlet.setLoadOnStartup(1);
    myServlet.addMapping("/");
  }

  public void addFilter(ServletContext servletContext) {
    CharacterEncodingFilter charEncodingFilter = new CharacterEncodingFilter("UTF-8", true, true);
    FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", charEncodingFilter);
    myFilter.addMappingForUrlPatterns(null, true, "/**");
  }
}
