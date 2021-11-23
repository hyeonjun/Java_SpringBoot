package com.freeflux;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(properties = {"author.name=GG", "author.age=22", "author.code=KR"})
@ExtendWith(SpringExtension.class)
public class PropertiesTest {
	
	@Autowired
	Environment en;
	
	public PropertiesTest() {
		
	}
	
	@Test
	public void testMethod() {
		System.out.println(en.getProperty("author.name"));
		System.out.println(en.getProperty("author.age"));
		System.out.println(en.getProperty("author.code"));
	}

}
