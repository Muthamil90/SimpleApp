package com.thamil.openshift.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	public String getMessage() {
		return "Hi From Controller";
	}

}
