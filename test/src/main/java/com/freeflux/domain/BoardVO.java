package com.freeflux.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVO {
	
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate = new Date();
	private int cnt = 0;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

}
