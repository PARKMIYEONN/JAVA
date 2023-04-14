package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {
	
	List<BoardVO> boardDao = new ArrayList<>();
	
	public void insertBoard(BoardVO vo) {
		boardDao.add(vo);
	}

}
