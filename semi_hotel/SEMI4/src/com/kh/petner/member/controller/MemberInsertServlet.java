package com.kh.petner.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.petner.member.model.exception.MemberException;
import com.kh.petner.member.model.service.MemberService;
import com.kh.petner.member.model.vo.Member;


@WebServlet("/PmInsert.me")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 인코딩
	
		String userEmail = request.getParameter("userEmail");
		String userPwd = request.getParameter("userPwd");
		String userPwd2 = request.getParameter("userPwd2");		
		String userName = request.getParameter("userName");
		String userPhone = request.getParameter("userPhone");
		System.out.println("pwd1 : " +userPwd );
		System.out.println("pwd2 : " +userPwd2 );
		
		if(!userPwd.equals(userPwd2)) {
			System.out.println("비밀번호 불일치");
			request.setAttribute("msg",  "비밀번호가 일치 하지 않습니다");
			request.setAttribute("exception", null);
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
			return;
		}
		
		//회원 가입시 전달을위한 vo생성
		Member m = new Member(userEmail, userPwd, userName, userPhone);
//		System.out.println("정보 확인 : "+m);	//콘솔창 확인
		
		MemberService ms = new MemberService();
		
		try {
			ms.insertMember(m);
			System.out.println("가입 완료");
			
			response.sendRedirect("index.jsp");
			
		} catch (MemberException e) {
			request.setAttribute("msg",  "회원 가입 중 에러 발생!");
			request.setAttribute("exception", e);
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
