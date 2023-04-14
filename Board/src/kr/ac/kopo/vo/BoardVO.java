package kr.ac.kopo.vo;

public class BoardVO {		//게시판의 기본 단위를 저장하는 보드브이오 클래스
	
	private int no;
	private String title;
	private String writer;
	private String regDate;
	
	public BoardVO(){
		
	}
	

	public BoardVO(int no, String title, String writer, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	
	


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + "]";
	}

}
