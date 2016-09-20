package com.movie.persistence;

import java.util.List;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;
import com.movie.domain.TiketBean;


public interface TicketingDAO {
	
	public void ticketRegister(TiketBean tib);
	
	public void userRegister(CustomerBean cb);
	
	public MovieBean movieSearch(String title);
	
	public void theaterRegister(TheaterBean tb);
	
	public List<TheaterBean> theaterList();
	
	public void movieRegister(MovieBean mb);
	
	public List<MovieBean> movieList();
}
