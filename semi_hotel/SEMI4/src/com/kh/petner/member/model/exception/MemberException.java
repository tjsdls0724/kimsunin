package com.kh.petner.member.model.exception;

public class MemberException extends Exception{
		//예외 발생시 화면에 정해진 문장을 띄워주기 위하여 사용한다.
	
	public MemberException() {
		
	}
	
	public MemberException(String message) {
		super(message);
	}
	
}
