package com.movie.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movie.domain.MovieBean;
import com.movie.persistence.DaumApi;
import com.movie.service.TicketService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Inject
	private TicketService service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Ticket/main";
	}
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String titleSearch(String searchKey,Model model) {
		MovieBean mb=new MovieBean();
		mb=service.movieFind(searchKey);
		model.addAttribute("result",mb);
		System.out.println(mb.getImg());
		return "Ticket/searchResult";
	}
	
	@RequestMapping(value = "/movieRegister", method = RequestMethod.GET)
	public String AdminMovieRegisterPage() throws UnsupportedEncodingException, IOException, ParseException {
		return "admin/movieRegister";
	}
	
	
	@RequestMapping(value = "/mSearch", method = RequestMethod.GET)
	@ResponseBody
	public String adminMovieSearch(String searchKey,Model model) throws UnsupportedEncodingException, IOException, ParseException {
		MovieBean mb=new MovieBean();
		DaumApi dApi=new DaumApi();
		mb=dApi.movieSearch(searchKey);
		model.addAttribute("result",mb);
		System.out.println(mb.getImg());
		return "success";
//		return "Ticket/searchResult";
	}

}
