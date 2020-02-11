package com.kh.petner.hotel.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.petner.hotel.model.service.HotelService;
import com.kh.petner.hotel.model.vo.Hotel;
import com.kh.petner.hotel.model.vo.HotelPageInfo;

/**
 * Servlet implementation class HotelSearchServlet
 */
@WebServlet("/searchHotel")
public class HotelSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 검색 카테고리, 검색 키워드 도 가져오자( getParameter에서 사용되는 key값은 태그의 name 속성 값인데 클릭 이벤트를 주면서 
		// 							     서블릿을 호출하는 주소를 생서할 때 key 값의 속성명을 수정해서 전달해서 태그의 name과 다르니 헷갈리지말자)
		
		String location = request.getParameter("loc");
		String name = request.getParameter("hon");
		System.out.println("HotelSearchSerVlet loc : " + location);
		System.out.println("HotelSearchSerVlet hon : " + name);
		if(location != null) {
			
			String[] locationArr = null;
			
			locationArr = location.split(",");
			for(int i=0; i<locationArr.length; i++) {
				System.out.println(locationArr[i]);
			}
			
			
			ArrayList<Hotel> list = new ArrayList<Hotel>();
			
			HotelService hs = new HotelService();
			
			list = hs.searchHotelLocation(locationArr);
			
			String page = "";
			
			if(list != null) {
				System.out.println("sikim HotelSearchServlet if문");
				page = "views/hotel/hotel_home.jsp";
				request.setAttribute("list", list);
				
//				HotelPageInfo hpi = new HotelPageInfo(currentPage,listCount,limit,maxPage,startPage,endPage);
				HotelPageInfo hpi = new HotelPageInfo(1,100,1,1,1,1);
				request.setAttribute("hpi", hpi);
				
			}else {
				System.out.println("sikim HotelSearchServlet else문");
				page = "views/common/errorPage.jsp";
				request.setAttribute("msg", "공지사항 목록 불러오기 에러");
			}
			System.out.println("sikim HotelSearchServlet request");
			request.getRequestDispatcher(page).forward(request, response);
			
		}else {
		
			ArrayList<Hotel> list = new ArrayList<Hotel>();
			HotelService hs = new HotelService();
			
			list = hs.searchHotelName(name);
			
			String page = "";
			
			if(list != null) {
				System.out.println("HotelSearchSerVlet SearchName if문");
				page = "views/hotel/hotel_home.jsp";
				request.setAttribute("list", list);
				
//				HotelPageInfo hpi = new HotelPageInfo(currentPage,listCount,limit,maxPage,startPage,endPage);
				HotelPageInfo hpi = new HotelPageInfo(1,100,1,1,1,1);
				request.setAttribute("hpi", hpi);
			}else {
				page = "views/common/errorPage.jsp";
				request.setAttribute("msg", "공지사항 목록 불러오기 에러");
			}
			request.getRequestDispatcher(page).forward(request, response);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
