package ch6;

// 15번 연습문제

public class MemberService {
	
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}
		else
			return false;
		
	}
	
	void logout(String id) {
		this.id = id;
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
