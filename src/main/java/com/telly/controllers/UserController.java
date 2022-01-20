package com.telly.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.telly.dao.User;






@Controller
public class UserController {



	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/loggedout")
	public String showLogout() {
		return "loggedout";
	}
	@RequestMapping("/createaccount")
	public String createAccount(Model model, Principal principal) {

		model.addAttribute("user", new User());

		return "createaccount";
	}
	

	

}



