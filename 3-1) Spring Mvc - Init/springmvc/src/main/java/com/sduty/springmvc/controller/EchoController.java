package com.sduty.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sduty.springmvc.vo.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {
  @RequestMapping(method = RequestMethod.GET)
  public String viewInput(Model model) {
    EchoForm form = new EchoForm();
    model.addAttribute("echoForm", form);
    return "echo/input";
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String echo(EchoForm echoForm) {
    return "echo/output";
  }
}
