package com.movie.domain;

import java.util.List;

public class TiketBean {
	
	int num;
	String id;
	String name;
	String title;
	String theater;
	int theaterNum;
	List<Integer> seatNum;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public List<Integer> getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(List<Integer> seatNum) {
		this.seatNum = seatNum;
	}
	
	
}
