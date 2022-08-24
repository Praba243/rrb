package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Patient;

@Controller
//@RequestMapping("/api/tree")
public class PatientController {
	
	@RequestMapping("/abcd")
	public String/*List<Patient>*/ getTreeById(/* @PathVariable int id */Model model) {
		System.out.println("id");
		List<Patient> listPat=new ArrayList<>();
		Patient pat=new Patient();
		pat.setName("pat1");
		listPat.add(pat);
        //return listPat;
		return "abcde";
    }
}
