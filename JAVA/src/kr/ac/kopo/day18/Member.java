package kr.ac.kopo.day18;

public class Member {
	
	private String id;
	private String password;
	
	public Member() {
		
	}
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	



}
