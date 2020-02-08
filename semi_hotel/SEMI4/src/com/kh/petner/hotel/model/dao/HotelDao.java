package com.kh.petner.hotel.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.petner.hotel.model.vo.Hotel;
import static com.kh.petner.common.JDBCTemplate.*;
public class HotelDao {
	
	private Properties prop;
	
	public HotelDao() {
		prop = new Properties();
		
		String filePath = Hotel.class.getResource("/config/hotel-query.properties").getPath();
		
		try {
			prop.load(new FileReader(filePath));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//	전체 목록 조회 (페이징 처리 때문에 삭제)
	public ArrayList<Hotel> selectList(Connection con) {
		ArrayList<Hotel> list = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			

			list = new ArrayList<Hotel>();
			
			while(rset.next()){
					
				
				Hotel h = new Hotel();
				
				h.setHotel_num(rset.getInt(1));
				h.setHotel_name(rset.getString(2));
				
				list.add(h);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	 
	public ArrayList<Hotel> searchHotel(Connection con, String[] locationArr) {
		ArrayList<Hotel> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = null;
		for(int i=0; i<locationArr.length; i++) {
			System.out.println("dao@@@@@@@"+locationArr[i]);
		}
		
		sql = prop.getProperty("searchLocationGroupFirst");
		
		try {
			pstmt = con.prepareStatement(sql);
			list = new ArrayList<Hotel>();
			for(int i=0; i<locationArr.length; i++) {
					
				pstmt.setString(1, locationArr[i]);
				rset = pstmt.executeQuery();
				
				while(rset.next()) {
					Hotel h = new Hotel();
					
					h.setHotel_num(rset.getInt(1));
					h.setHotel_name(rset.getString(2));
					h.setHotel_location(rset.getString(3));
					list.add(h);
				}
			}	
			

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		return list;
	}

	public ArrayList<Hotel> searchHotelName(Connection con, String name) {
		ArrayList<Hotel> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = null;
		
		sql = prop.getProperty("searchHotelName");
		
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Hotel>();
			while(rset.next()) {
				Hotel h = new Hotel();
				
				h.setHotel_num(rset.getInt(1));
				h.setHotel_name(rset.getString(2));
				h.setHotel_location(rset.getString(3));
				
				list.add(h);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		return list;
	}

	public int getListCount(Connection con) {
		int listCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("listCount");
		
		try {
			
			stmt = con.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

}
