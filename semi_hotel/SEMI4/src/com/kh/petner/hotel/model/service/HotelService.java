package com.kh.petner.hotel.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.petner.hotel.model.dao.HotelDao;
import com.kh.petner.hotel.model.vo.Hotel;
import static com.kh.petner.common.JDBCTemplate.*;

public class HotelService {

	private HotelDao hDao = new HotelDao();
	
	public int getListCount() {
		
		Connection con = getConnection();
		
		int listCount = hDao.getListCount(con);
	
		close(con);
		
		return listCount;
	}
	
	
/*	 전체 목록 조회 (페이징 처리 때문에 삭제)
	public ArrayList<Hotel> selectList() { //강사님은 한개 선택하는 메소드 이름으로 했는데 나는 전체 선택 메소드로 만듬 
		Connection con = getConnection();
		
		ArrayList<Hotel> list = hDao.selectList(con);
		
		close(con);
		
		
		return list;
	}*/
/*	public ArrayList<Hotel> searchHotel(String[] locationArr) {
		Connection con = getConnection();
		ArrayList<Hotel> list = null;
		
		if(locationArr.length > 0) {
			list = hDao.searchHotel(con,locationArr);
		}else {
			list = hDao.selectList(con);
		}
		close(con);
		
		return list;
	}*/
/*	public ArrayList<Hotel> searchHotelName(String name) {
		Connection con = getConnection();
		ArrayList<Hotel> list = null;
		
		if(name.length() > 0) {
			list = hDao.searchHotelName(con,name);
		}else {
			list = hDao.selectList(con);
		}
	
		close(con);
		
		return list;
	}*/
	public ArrayList<Hotel> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<Hotel> list = hDao.selectList(con,currentPage,limit);
		
		close(con);
		
		return list;
		
	}




	
}
