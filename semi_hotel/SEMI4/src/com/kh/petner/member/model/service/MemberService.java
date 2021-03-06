package com.kh.petner.member.model.service;

import static com.kh.petner.common.JDBCTemplate.*;

import java.sql.Connection;

import com.kh.petner.member.model.dao.MemberDao;
import com.kh.petner.member.model.exception.MemberException;
import com.kh.petner.member.model.vo.Member;

public class MemberService{

	private Connection con;
	private MemberDao mDao = new MemberDao();
	
	public Member selectMember(Member m) throws MemberException {
		System.out.println("MemberService selectMember");
		
		con=getConnection();
		System.out.println("MemberService getConnection");
		Member result = mDao.selectMember(con,m);
		
		
		System.out.println("Return : MemberService selectMember : "+ m);
		close(con);
		
		if(result == null) {
			throw new MemberException("회원 이메일 혹은 비밀번호가 올바르지 않습니다.");
		}
		
		return result;
	}

	public int insertMember(Member m) throws MemberException {
		int result=0;
		
		con=getConnection();
		
		System.out.println("service - insertMember : " + m);
		
		result = mDao.insertMember(con,m);
		
		if(result>0) { //성공
			System.out.println("commit : "+result);
			commit(con);
		}else { //실패
			System.out.println("rollback");
			rollback(con);
		}
		
		close(con);
		
		return result;
		
	}

	public Member searchPwd(Member m) throws MemberException {
		Member result = null;
		
		con=getConnection(); 	//Connectin con = getconnection();
		
		result = mDao.searchPwd(con,m);
		
		close(con);
		
		return result;
	}

	



}
