package com.kh.petner.member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.petner.member.model.exception.MemberException;
import com.kh.petner.member.model.vo.Member;

import static com.kh.petner.common.JDBCTemplate.close;

public class MemberDao {

	private Properties prop;
	
	public MemberDao() {
		prop=new Properties();
		String filePath = MemberDao.class.getResource("/config/member-query.properties").getPath();
		
		try {
			prop.load(new FileReader(filePath));
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	} //기본 생성자
	
	public Member selectMember(Connection con, Member m) throws MemberException {
		System.out.println("MemberDao selectMember");
		
		Member result = null;
		
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		
		
		try {
			System.out.println("MemberDao selectMember try ");
			
			pstmt=con.prepareStatement(prop.getProperty("selectMember"));
			pstmt.setString(1, m.getUserEmail());
			pstmt.setString(2, m.getUserPwd());
			
			
			rset = pstmt.executeQuery();
			System.out.println("MemberDao selectMember executeQuery ");
			
			
			if(rset.next()) {
				System.out.println("MemberDao selectMember if");
				
				result = new Member(rset.getString("USER_NAME")
												, rset.getString("USER_EMAIL")
												, rset.getString("USER_PASSWORD")
												, rset.getString("USER_PHONE")
												, rset.getInt("USER_ROLES")
													);
			}//if
			
			
		} catch (Exception e) {
			throw new MemberException(e.getMessage());
		}finally {
			close(rset);
			close(pstmt);
		}
		
		System.out.println("RESULT : "+result);
		
		return result;
	}

	public int insertMember(Connection con, Member m) throws MemberException {
		int result=0;
		PreparedStatement pstmt=null;
		try {
			
			System.out.println("mDao - insertMember : " + m);
			
			pstmt = con.prepareStatement(prop.getProperty("insertMember"));
			pstmt.setString(1, m.getUserName());
			pstmt.setString(2, m.getUserEmail());
			pstmt.setString(3, m.getUserPwd());
			pstmt.setString(4, m.getUserPhone());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new MemberException(e.getMessage());
		}finally {
			close(pstmt);
		}
		
		
		return result;
	}

	public Member searchPwd(Connection con, Member m) throws MemberException {
		
		System.out.println("sikim MemberDao selectMember");
		
		Member result = null;
		
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		
		
		try {
			System.out.println("sikim MemberDao selectMember try ");
			
			pstmt=con.prepareStatement(prop.getProperty("SearchEmail"));
			pstmt.setString(1, m.getUserEmail());
					
			rset = pstmt.executeQuery();
			System.out.println("sikim MemberDao selectMember executeQuery ");
					
			if(rset.next()) {
				System.out.println("sikim MemberDao selectMember if");
				
				result = new Member(rset.getString("USER_EMAIL")
												, rset.getString("USER_PASSWORD")
												, rset.getString("USER_PASSWORD_HINT")
													);
			}//if
					
		} catch (Exception e) {
			throw new MemberException(e.getMessage());
		}finally {
			close(rset);
			close(pstmt);
		}
		
		System.out.println("sikim MemberDao RESULT : "+result);
		
		return result;
	}

		
}


