package com.patProj.patAppoinment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResCon {

	@GetMapping("/res")
	public String meth() {
		return " abcduhuih";
	}
}
