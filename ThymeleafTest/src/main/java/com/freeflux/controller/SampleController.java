package com.freeflux.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.domain.MemberVO;

@Controller
@RequestMapping("/sample")
public class SampleController {
	@GetMapping("/sample1")
	public void sample1(Model model) {
		// model.addAttribute("greeting", "Hello World");
		model.addAttribute("greeting", "안녕하세요");
	}

	@GetMapping("/sample2")
	public void sample2(Model model) {
		MemberVO vo = new MemberVO(123, "u00", "p00", "홍길동", new Timestamp(System.currentTimeMillis()));
		model.addAttribute("vo", vo);
	}
	
	@GetMapping("/sample3")
	public void sample3(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i=0; i<10; i++) {
			list.add(new MemberVO(123, "u00"+i, "p00"+i, "홍길동"+i, new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
	}
	
	@GetMapping("/sample4")
	public void sample4(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i=0; i<10; i++) {
			list.add(new MemberVO(123, "u00"+i%3, "p00"+i%3, "홍길동"+i, new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
	}
	
	// Model 객체를 JavaScript에서 사용
	@GetMapping("/sample5")
	public void sample5(Model model) {
		String result = "SUCCESS";
		model.addAttribute("result", result);
	}
	
	// Model 객체를 직접 출력 및 JavaScript 변수값을 태그에서 출력 ( [[${변수명}]] )
	@GetMapping("/sample6")
	public void sample6(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i=0; i<10; i++) {
			list.add(new MemberVO(123, "u00"+i, "p00"+i, "홍길동"+i, new Timestamp(System.currentTimeMillis())));
		}
		model.addAttribute("list", list);
		String result = "SUCCESS";
		model.addAttribute("result", result);
	}
	
	// Thymleaf 객체를 이용한 출력형식 변경 : sample7.html => #객체명.메서드()
	@GetMapping("/sample7")
	public void sample7(Model model) {
		model.addAttribute("now", new Date());
		model.addAttribute("price", 123456789);
		model.addAttribute("title", "This is a just sample.");
		model.addAttribute("option", Arrays.asList("AAA", "BBB", "CCC", "DDD"));
	}
	
	// Thymleaf 객체를 이용한 링크 : sample8.html => @{링크주소}
	@GetMapping("/sample8")
	public void sample8(Model model) {}
	
	// 다중 매핑 : {"/요청", "/요청", "/요청"}
	@GetMapping({"/exLayout1", "/exLayout2", "/exTemplate", "/exSideBar" })
	public void multiMapping() {
		
	}

}









