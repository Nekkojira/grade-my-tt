package com.onea.playground.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlejandraController {
			@RequestMapping(value="/alejandra")
		String alejandra(Model model, HttpServletRequest request, HttpServletResponse response){
			return "alejandra";
		}
	}
