package com.lat;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	  @GetMapping("/")
	  public String homepage() {
		  return "index";
	  }
	  
	  @GetMapping("/login")
	  public String login() {
		  return "login";
	  }
	  
	  @GetMapping("/register")
	  public String register() {
		  return "register";
	  }
	  
	  @GetMapping("/about")
	  public String about() {
		  return "about";
	  }
	  
	  @GetMapping("/shop") 
	  public String shop() { 
		  return "shop"; 
	  }
		 
	  @GetMapping("/cart")
	  public String cart() {
		  return "cart";
	  }


}
