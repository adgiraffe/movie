package com.movie.persistence;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;
import com.movie.domain.TiketBean;

@Repository

public class TicketingImpl implements TicketingDAO {
	
	@Inject 
	private SqlSession sqlSession;
	//@Inject 
	//private DaumApi daumApi;
	//@Inject 
	//private MovieBean mb;
	
	@Override
	public void ticketRegister(TiketBean tib) {
		// TODO Auto-generated method stub
		sqlSession.insert("tiketingInfo", tib);
	}

	@Override
	public void userRegister(CustomerBean cb) {
		// TODO Auto-generated method stub
		sqlSession.insert("userRegister",cb);
	}

	@Override
	public MovieBean movieSearch(String title) {
		// TODO Auto-generated method stub
		
		MovieBean mb=new MovieBean();
		DaumApi daumApi=new DaumApi();
		mb=sqlSession.selectOne("movieInfo", title);
		
		if (title==mb.getTitle()) {
			return mb;
		}/*else if(){
			
		}*/
		else{
			try {
				mb=daumApi.movieSearch(title);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mb;
	}

	@Override
	public void theaterRegister(TheaterBean tb) {
		// TODO Auto-generated method stub
		sqlSession.insert("theaterRegister", tb);
	}

	@Override
	public List<TheaterBean> theaterList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("theaterList");
	}

	@Override
	public void movieRegister(MovieBean mb) {
		// TODO Auto-generated method stub
		sqlSession.insert("movieRegister", mb);
	}

	@Override
	public List<MovieBean> movieList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("movieList");
	}

	
}
