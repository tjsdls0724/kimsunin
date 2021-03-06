package com.kh.petner.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.petner.member.model.exception.MemberException;
import com.kh.petner.member.model.service.MemberService;
import com.kh.petner.member.model.vo.Member;

/**
 * Servlet implementation class PwdSearchServlet
 */
@WebServlet("/pwdsearch")
public class PwdSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PwdSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
	
		String userEmail = request.getParameter("userEmail");
		String userPwdHint = request.getParameter("userPwdHint");
		
		System.out.println("sikim SearchPwdServlet userEmail : " + userEmail);
		System.out.println("sikim SearchPwdServlet userPwd : " + userPwdHint);
		
		Member m_pwd = new Member();
		m_pwd.setUserEmail(userEmail);
		m_pwd.setUserPwd(userPwdHint);
		
		MemberService ms = new MemberService();
		
		try {
			m_pwd = ms.searchPwd(m_pwd);
				if(m_pwd != null) {
					System.out.println("m_pwd.getUserPwdHint() : " + m_pwd.getUserPwdHint() +", userPwdHint : " + userPwdHint);
					if(m_pwd.getUserPwdHint().equals(userPwdHint)) {
						System.out.println("비밀번호 찾기 성공");
						request.setAttribute("m_pwd", m_pwd);
						request.getRequestDispatcher("views/member/searchPwConfirm.jsp").forward(request, response);
					}else {
						System.out.println("비밀번호 찾기 실패(힌트가 틀렸어)");
						response.setContentType("text/html; charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<script>alert('힌트가 틀렸어'); history.go(-1);;</script>");
						out.flush();
					}
				}
				else {
					System.out.println("비밀번호 찾기 실패2(이메일이 틀렸어)");
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('이메일이 틀렸어'); history.go(-1);;</script>");
					out.flush();
				}
		} catch (MemberException e) {
			e.printStackTrace();
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
