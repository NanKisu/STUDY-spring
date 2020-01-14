package com.study.springmvcwithoutxml.controller;

import java.awt.datatransfer.StringSelection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.study.springmvcwithoutxml.vo.InputText;

@Controller
@RequestMapping(value = "/")
public class HomeController{
  @RequestMapping(method = RequestMethod.GET)
  public String home() {
    return "home";
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String post(@RequestParam(name = "text") String text, ModelMap model) {
    model.addAttribute("text", text);
    System.out.println("@RequestBody: " + text);
    return "home";
  }
}
