/**
 * Controller package having controllers for all the incoming requests.
 */
package com.gl.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Welcome Controller to receive all the incoming requests for the welcome page.
 */
@Controller
public class WelcomeController {

	/**
	 * Constructor of welcome controller
	 */
	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/welcome")
	public String handleWelcomePage() {
		return "welcome";
	}

}
