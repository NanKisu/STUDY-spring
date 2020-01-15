package com.study.webapp.controller;

import java.security.Principal;
import java.util.Locale;
import java.util.TimeZone;
import javax.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;
import com.study.webapp.vo.FormInput;

@Controller
@RequestMapping(path = {"/study"})
public class StudyController {
  
  @GetMapping(path = {"/model"})
  public String model(Model model) {
    model.addAttribute("message", "models message");
    return "home";
  }
  
  @GetMapping(path = {"/redirectattribute"})
  public String redirectattribute(RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("message", "redirectAttributes message");   
    return "redirect:/";
  }
  
  @PostMapping(path = {"/beansandvalidation"})
  public String beansandvalidation(@Valid FormInput formInput, BindingResult bindingResult, Model model) {
    System.out.println("formInput: " + formInput);
    if(bindingResult.hasErrors()) {
      model.addAttribute("message", "bindingResult have a error.");   
      return "home";
    }
    model.addAttribute("message", "bindingResult doesn't have a error.");   
    return "home";
  }
  
  @GetMapping(path = {"/httpentity"})
  public HttpEntity<String> httpendity(HttpEntity<String> httpEntity) {
    System.out.println("getHeader: " + httpEntity.getHeaders()); 
    System.out.println("getBodyr: " + httpEntity.getBody()); 
    HttpEntity<String> response = new HttpEntity<String>("Response");
    return response;
  }
  
  @GetMapping(path = {"/locale"})
  public String locale(Locale locale, Model model) {
    System.out.println(locale.getCountry());
    System.out.println(locale.getLanguage());
    System.out.println(locale.getScript());
    model.addAttribute("message", locale.getDisplayLanguage());
    return "home";
  }
  
  @GetMapping(path = {"/timezone"})
  public String timezone(TimeZone timeZone, Model model) {
    System.out.println(timeZone.getDisplayName());
    System.out.println(timeZone.getID());
    model.addAttribute("message", timeZone.getDisplayName());
    return "home";
  }
  
  @GetMapping(path = {"/principal"})
  public String principal(Principal principal, Model model) {
    System.out.println(principal.getName());
    model.addAttribute("message", principal.getName());
    return "home";
  }
  
  @GetMapping(path = {"/uricomponentsbuilder"})
  public String uriComponentsBuilder(UriComponentsBuilder uriComponentsBuilder, Model model) {
    System.out.println(uriComponentsBuilder.build().getHost());
    System.out.println(uriComponentsBuilder.build().getPath());
    System.out.println(uriComponentsBuilder.build().getPort());
    System.out.println(uriComponentsBuilder.build().getQuery());
    System.out.println(uriComponentsBuilder.build().getScheme());
    System.out.println(uriComponentsBuilder.build().getUserInfo());
    model.addAttribute("message", uriComponentsBuilder.build().toUriString());
    return "home";
  }
  
  @GetMapping(path = {"/sessionstatus"})
  public String sessionStatus(SessionStatus sessionStatus, Model model) {
    System.out.println(sessionStatus.toString());
    System.out.println(sessionStatus.isComplete());
    model.addAttribute("message", sessionStatus.toString());
    return "home";
  }
  
}
