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
import com.kh.petner.hotel.model.vo.HotelPageInfo;

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
		
		int startPage;
		
		// 한 번에 표시할 페이지들 중 가장 뒤의 페이지
		int endPage;
		
		// 전체 페이지의 가장 마지막에 있는 페이지
		int maxPage; 
		
		// 사용자가 위치한 현재 페이지
		int currentPage;
		
		// 총 페이지 수 (한 페이지 당 보여줄 게시글의 수)
		int limit;
		
		// 처음 접속 시 페이지는 1페이지 부터 시작한다 
		currentPage = 1; 
		
		// 글 개수 및 페이지 수 10개로 제한하기
		limit = 6;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		int listCount = hs.getListCount();
		
		System.out.println("총 페이지 개수 : " + listCount);
		
		maxPage = (int)((double)listCount/ limit + 0.9);
		startPage = (int)((double)currentPage/limit + 0.9-1) * limit + 1;
		endPage = startPage + limit -1;
		
		if(endPage > maxPage){
			endPage = maxPage;
		}
		
		list = hs.selectList(currentPage, limit);
		
		String page = "";
		
		if(list != null) {
			page = "views/hotel/hotel_home.jsp";
			request.setAttribute("list", list);
			
			HotelPageInfo hpi = new HotelPageInfo(currentPage,listCount,limit,maxPage,startPage,endPage);
			
			request.setAttribute("hpi", hpi);
			
		}else {
			page = "views/common/errorPage.jsp";
			request.setAttribute("list", list);
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}
		
/*		list = hs.selectList(); // DB에서 검색해온 결과 값을 ArrayList담아서 온다(타입은 Hotel)
		
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
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
