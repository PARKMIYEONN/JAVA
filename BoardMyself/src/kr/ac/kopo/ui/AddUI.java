package kr.ac.kopo.ui;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class AddUI extends BaseUI {
	
	private BoardDAO boardDao;
	
	public AddUI() {
		boardDao = new BoardDAO();
	}

	@Override
	public void execute() throws Exception {
		
		String title = scanStr("제목을 입력하세요");
		String writer = scanStr("글쓴이를 입력하세요");
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		boardDao.insertBoard(vo);
		
		
		System.out.println("새글 등록을 완료");
		
	}
	
	

}
