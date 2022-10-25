package pxu.springMVC_baitap1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import pxu.springMVC_baitap1.model.loginForm;


@Controller
public class LoginController {

	@ModelAttribute("loginForm")
	public loginForm setLoginForm() {
		return new loginForm();
	}

	@GetMapping("/showLoginForm")
	public String showForm() {
		return "login-form";
	}
	
	@PostMapping("/saveLoginForm")
	public ModelAndView loginUser(@ModelAttribute("loginForm") loginForm loginForm) {
		ModelAndView modelAndView = new ModelAndView();
		if (loginForm.getUserName().equals("admin") && loginForm.getPassWord().equals("admin")) {
			modelAndView.setViewName("admin-form");
			modelAndView.addObject("message", "Logged in successfully");
			modelAndView.addObject("user", loginForm);			
		} else {
			modelAndView.setViewName("login-form");
			modelAndView.addObject("message", "Login failed");
		}
		return modelAndView;
	}

}	
