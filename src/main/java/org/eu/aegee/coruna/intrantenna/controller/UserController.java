package org.eu.aegee.coruna.intrantenna.controller;

import java.security.Principal;

import org.eu.aegee.coruna.intrantenna.model.domain.User;
import org.eu.aegee.coruna.intrantenna.model.exceptions.DuplicateInstanceException;
import org.eu.aegee.coruna.intrantenna.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alberto Ayora Pais
 *
 */

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
//	@RequestMapping(value="/")
//	public String index() {
//		
//		return "index";
//	}
	
//	@RequestMapping(value="/createUser", method=RequestMethod.POST)
//	public void createUser(Model model) {
//		
//		//ModelAndView mav = new ModelAndView("user");
//		
//		try {
//			
//			User user = userService.create(null);
//			
//		} catch (DuplicateInstanceException e) {
//		
//			e.printStackTrace();
//		}
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		
		return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
	}
	
}
