package com.bank.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class BankController {


 
    @Autowired
    private UserService service;
    
    
    @GetMapping("/")
   	public String viewp(Model model) {
   		// create model attribute to bind form data
   		User user = new User();
   		model.addAttribute("user", user);
   		return "index";
   	}
    
    @GetMapping("/register")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		User user = new User();
		model.addAttribute("user", user);
		return "user";
	}
    
	@PostMapping("/saveuser")
	public String saveusers(@ModelAttribute("user") User user) {
		// save employee to database
		service.saveuser(user);
		return "redirect:/";
	}
	  
  }
    
    
    
