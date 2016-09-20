package com.movie.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;
import com.movie.domain.TiketBean;
import com.movie.persistence.TicketingDAO;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Inject 
	private TicketingDAO dao;
	
	@Override
	public void ticketCreate(TiketBean tib) {
		// TODO Auto-generated method stub
		dao.ticketRegister(tib);
	}

	@Override
	public void userCreate(CustomerBean cb) {
		// TODO Auto-generated method stub
		dao.userRegister(cb);
	}

	@Override
	public MovieBean movieFind(String title) {
		// TODO Auto-generated method stub
		return dao.movieSearch(title);
	}

	@Override
	public void theaterCreate(TheaterBean tb) {
		// TODO Auto-generated method stub
		dao.theaterRegister(tb);
	}

	@Override
	public List<TheaterBean> theaterRoll() {
		// TODO Auto-generated method stub
		return dao.theaterList();
	}

	@Override
	public void movieCreate(MovieBean mb) {
		// TODO Auto-generated method stub
		dao.movieRegister(mb);
	}

	@Override
	public List<MovieBean> movieRoll() {
		// TODO Auto-generated method stub
		return dao.movieList();
	}
}
