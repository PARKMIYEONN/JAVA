package kr.ac.kopo.day19.member;
/*
 * alt + shift + s 누른후 c선택 : 디폴트생성자
 * 						 o선택 : 매개변수를 가진 생성자
 * 						 r선택 : getter/setter 메소드
 * 						 s선택 : toString() 오버라이드
 * 						 v선택 : 부모에게서 상속받은 메소드들을 오버라이드
 */
public class Member {

	
	@Override
	public String toString() {		//이렇게 만들어놓으면 객체의 데이터를 m.get 같은거 해서 볼 필요 없음.
		return "Member [id=" + id + ", password=" + password + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Member(String id) {
		super();
		this.id = id;
	}


	@Override								//아이디는 중복되지 않는 값이니까
	public int hashCode() {					//id만 같으면 같은 객체라고 인식하게 해줌
											//패스워드는 조건에 안 넣어줬어
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override								//아이디는 중복되지 않는 값이니까
	public boolean equals(Object obj) {		//id만 같으면 같은 객체라고 인식하게 해줌
											//패스워드는 조건에 안 넣어줬어
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	private String id;
	private String password;
	
	
	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}


	public Member() {
		super();
		
	}
	
	
}
