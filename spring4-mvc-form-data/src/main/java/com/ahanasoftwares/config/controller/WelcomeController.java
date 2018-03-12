package com.ahanasoftwares.config.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ahana Software Technologies
 *
 */

@Controller
public class WelcomeController {
	
	
	@RequestMapping(path={"/"},method=RequestMethod.GET)
	   public String sayHello(Model model) {
	      return "myform";
	}

}
