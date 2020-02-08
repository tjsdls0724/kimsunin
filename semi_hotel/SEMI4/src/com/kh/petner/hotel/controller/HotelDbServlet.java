package com.kh.petner.hotel.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.petner.hotel.model.service.HotelService;
import com.kh.petner.hotel.model.vo.Hotel;

/**
 * Servlet implementation class HotelDbServlet
 */
@WebServlet("/hotelDbServlet")
public class HotelDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Hotel> list = null;
		
		HotelService hs = new HotelService();
		
		list = hs.selectList(); // DB에서 검색해온 결과 값을 ArrayList담아서 온다(타입은 Hotel)
		
		if(list == null) System.out.println("list는 null");
		
		int i=0;
        for(Hotel h : list) {
        	i++;
        }
		String page = "";
		
		if(list != null) {
			page = "views/hotel/hotel_home.jsp";
			request.setAttribute("list", list);
			
		}else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("msg", "공지사항 목록 불러오기 에러");
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}