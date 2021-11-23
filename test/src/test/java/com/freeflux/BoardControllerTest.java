package com.freeflux;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.freeflux.service.BoardService;

@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
public class BoardControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private BoardService boardService;
	
	public BoardControllerTest(){}
	
	@Test
	public void testHello() throws Exception {
		when(boardService.hello("테스트")).thenReturn("Hello : 테스트");
		
		mockmvc.perform(get("/hello")
		.param("name", "전달값"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello : 테스트"))
		.andDo(print());
	}

}
