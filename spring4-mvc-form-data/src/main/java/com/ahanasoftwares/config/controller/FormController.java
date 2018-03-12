/**
 * Ahana Software Technologies
 */
package com.ahanasoftwares.config.controller;

/**
 * @author Ahana Software Technologies
 *
  */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping(path={"/processForm"},method=RequestMethod.GET)
	   public String processForm(Model model) {
	      return "index";
	}
	@RequestMapping(path={"/processReqParam"},method=RequestMethod.POST)
	   public String processReqParam(@RequestParam(name = "personName") String personName){
		System.out.println("The Name is -->" + personName); 
	      return "index";
	}
	@GetMapping("/processPathVar/{personName}")
	   public String processPathVari(@PathVariable("personName") String personName, Model model){
		model.addAttribute("personName", personName);
		System.out.println("The Name is -->" + personName); 
	      return "index";
	}
   
   
}

