package com.capgemini.cartservices;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.cartservices.repsoitory.CartRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceRepositoryTest {

	@Autowired
	CartRepository repository;
	
	
}
