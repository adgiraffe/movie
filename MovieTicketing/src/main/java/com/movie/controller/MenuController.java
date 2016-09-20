package com.movie.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.persistence.DaumApi;

@Controller
@RequestMapping("/menu/")
public class MenuController {
	
	//@Inject
	//private DaumApi dApi;
	
	@RequestMapping("/menu/")
	public void moiveSearch(){
		
	}
}
