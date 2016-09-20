package com.movie.persistence;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import com.movie.domain.MovieBean;

@Repository
public class DaumApi {
	//@Inject
	//private MovieBean  mb;

	
	public MovieBean movieSearch(String keyword) throws UnsupportedEncodingException, IOException, ParseException{
		MovieBean mb = new MovieBean();
		try {

			String title=URLEncoder.encode(keyword,"UTF-8");
			URL url = 
					new URL("https://apis.daum.net/contents/movie?apikey=77eeed7ba7ce787a48978ff2e868fcc4&q="+title+"&output=json");
			InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
			JSONObject object;
			
			object = (JSONObject)JSONValue.parseWithException(isr);
			JSONObject channel = (JSONObject) object.get("channel");
			JSONArray item = (JSONArray)channel.get("item");
			System.out.println(item);
			JSONObject obj=(JSONObject)item.get(0);
//			System.out.println(obj);

//			-------------------�쁺�솕 �젣紐�-----------------------

			JSONArray mTitleA=(JSONArray)obj.get("title");
			JSONObject mTitleO=(JSONObject)mTitleA.get(0);
			String mTitle=mTitleO.get("content").toString();
//			System.out.println(mTitle);
//			-----------------------------------------------------
			

//			-------------------媛먮룆-----------------------
			JSONArray directorA=(JSONArray)obj.get("director");
			JSONObject direcTorO=(JSONObject)directorA.get(0);
			String director=direcTorO.get("content").toString();
//			System.out.println(director);
//			-----------------------------------------------------				
			
//			-------------------異쒖뿰吏�-----------------------
			JSONArray actorA=(JSONArray)obj.get("actor");
			JSONObject actorO=(JSONObject)actorA.get(0);
			String actor=actorO.get("content").toString();
//			System.out.println(actor);
//			-----------------------------------------------------	
			
//			-------------------媛쒕큺�젙蹂�-----------------------
			JSONArray open_infoA=(JSONArray)obj.get("open_info");
			JSONObject open_infoO=(JSONObject)open_infoA.get(0);
			String open_info=open_infoO.get("content").toString();
//			System.out.println(open_info);
//			-------------------------------------------------
				
			
			
			
//			-------------------�쁺�솕 以꾧굅由�-----------------------				
			JSONArray describeA=(JSONArray)obj.get("story");
			JSONObject describeO=(JSONObject)describeA.get(0);
			String story=describeO.get("content").toString();
//			System.out.println(story);
//			-----------------------------------------------------				
	
//			-------------------�쁺�솕 �씠誘몄�-----------------------

			JSONArray thumbnailA=(JSONArray)obj.get("thumbnail");
			JSONObject thumnnailO=(JSONObject)thumbnailA.get(0);
			String thumbnail=thumnnailO.get("content").toString();
//			System.out.println(thumbnail);
//			-----------------------------------------------------
			
			mb.setTitle(mTitle);
			mb.setDirector(director);
			mb.setContent(story);
			mb.setImg(thumbnail);
			mb.setActor(actor);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mb;
	}
	
}
