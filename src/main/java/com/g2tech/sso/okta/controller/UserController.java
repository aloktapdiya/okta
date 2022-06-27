package com.g2tech.sso.okta.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "/user")
	   public Principal user(Principal principal) {
	      return principal;
	   }
	
	@RequestMapping(value="/sso")
	public String getWelcome() {
		return "Welcome to SSO";
	}
}