package com.movie.service;

import java.util.List;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;
import com.movie.domain.TiketBean;

public interface TicketService {
	
	public void ticketCreate(TiketBean tib);
	
	public void userCreate(CustomerBean cb);
	
	public MovieBean movieFind(String title);
	
	public void theaterCreate(TheaterBean tb);
	
	public List<TheaterBean> theaterRoll();
	
	public void movieCreate(MovieBean mb);
	
	public List<MovieBean> movieRoll();
}
