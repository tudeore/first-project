package com.capgemini.cartservices;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CartServiceRestControllerTest {

	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	public void testFoodItems() {
		
		ResponseEntity<Resource>responseEntity=testRestTemplate.getForEntity("/foodItems", Resource.class);
		
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.);
	}
	
}
