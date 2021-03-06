package com.kh.petner.member.model.vo;

public class Member {
	
	
	//멤버 변수
	private String userEmail;		//email겸 ID
	private String userPwd;			//비번
	private String userName;		//이름
	private String userPhone;		//폰번
	private int userRoles;				//디폴트(일반 유저) : 0, 최고 관리자 777
	private String userPwdHint;												// 일의 자리는 일반 유저가 할 수 있는 것의 권한을 지정
													// 십의 자리는 중간 관리자 권한 지정
													// 백의 자리는 관리자 권한 지정
	
	
	public Member() { //기본 생성자
	}

	//회원 가입시 입력할 정보에 대한 매개변수 생성자
	public Member(String userEmail, String userPwd, String userName, String userPhone) {
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userPhone = userPhone;
		
	}
	
	//로그인 시 회원 정보를 불러올 때 사용하는 생성자
	public Member(String userEmail, String userPwd, String userName, String userPhone, int userRoles) {
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userRoles = userRoles;
	}
	
	//비밀번호 찾기 시 불러올 생셩자
	public Member(String userEmail, String userPwd, String userPwdHint) {
		
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userPwdHint = userPwdHint;
	}

	public String getUserEmail() {
		return userEmail;
	}

	

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(int userRoles) {
		this.userRoles = userRoles;
	}
	
	public String getUserPwdHint() {
		return userPwdHint;
	}
	public void setUserPwdHint(String userPwdHint) {
		this.userPwdHint = userPwdHint;
	}

	@Override
	public String toString() {
		return "Member [userEmail=" + userEmail + ", userPwd=" + userPwd + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userRoles=" + userRoles + ", userPwdHint=" + userPwdHint + "]";
	}

	
	
	
	
	
}
