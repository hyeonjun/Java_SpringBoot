package com.freeflux.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.freeflux.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	public BoardServiceImpl() {
		System.out.println("BoardServiceImpl()");
	}

	@Override
	public String hello(String name) {
		return "HELLO : "+name;
	}

	@Override
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("test");
		board.setWriter("test");
		board.setContent("test");
		board.setRegDate(new Date());
		board.setCnt(0);
		return board;
	}

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<>();
		for(int i=0; i<=10; i++) {
			BoardVO vo = new BoardVO();
			vo.setSeq(i);
			vo.setTitle("title "+i);
			vo.setWriter("writer "+i);
			vo.setContent("content "+i);
			vo.setRegDate(new Date());
			vo.setCnt(0);
			boardList.add(vo);
		}
		return boardList;
	}

}
