package com.freeflux;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
class TestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("클래스 테스트 메서드(@SpringBootTest) 실행 전 : BeforeAll");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("테스트 메서드(@Test) 실행 전 : BeforeEach");
	}
	
	@Test
	@DisplayName("테스트_1")
	@Disabled // 테스트에서 제외
	@Order(2) // 테스트 순서
	void succeedingTest1() {
		System.out.println("테스트 call 1");
	}
	
	@Test
	@DisplayName("테스트_2")
	@Order(3)
	void succeedingTest2() {
		System.out.println("테스트 call 2");
	}
	
	@Test
	@DisplayName("테스트_3")
	@Order(1)
	void succeedingTest3() {
		System.out.println("테스트 call 3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("테스트 메서드(@Test) 실행 후 : @AfterEach");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("클래스 테스트 메서드(@SpringBootTest) 실행 후 : AfterAll");
	}
	
}
