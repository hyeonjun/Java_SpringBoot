package com.freeflux.service;

import java.util.List;

import com.freeflux.domain.BoardVO;

public interface BoardService {
	
	String hello(String name);
	
	BoardVO getBoard();
	
	List<BoardVO> getBoardList();
}

/**
 * 참고
 * interface 클래스 구성요소
 * 1. 상수 	: int n=0; => final
 * 2. 추상 메서드
 * 
 * interface 클래스 내부에 선언할 수 없는 요소
 * 1. 변수
 * 2. 생성자
 * 3. 일반 메서드 : {}
 * 
 * interface들은 다중 상속 가능
 * interface A {}
 * interface B {}
 * interface C extends A, B {}
 * 
 * class AA {}
 * 
 * class BB extends AA implements A, B {}
 * 일반 클래스는 다중 상속 불가능, 인터페이스는 가능
 * */
