package com.malek.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

	 @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	    @GetMapping("/projects")
	    public String projects() {
	        return "projects";
	    }

	    @GetMapping("/contact")
	    public String contactPage() {
	        return "contact"; // 
	    }
    
    
}
