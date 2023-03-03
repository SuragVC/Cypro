package com.cypro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import com.cypro.controller.TestController;

@SpringBootTest
class CyproApplicationTests {
	@Autowired
	private TestController testController;

	@Test
	void contextLoads() {
		ResponseEntity<String> ans=testController.test();
		assertNotNull(ans);
	}
	@Test
	void LoadTest() {
		ResponseEntity<String> ans=testController.test();
		assertEquals("working",ans.getBody());
	}
	

}
