package com.example.springcxf.client.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springcxf.client.AbstractTestCase;
import com.example.springcxf.client.endpoint.user.CreateUserDTO;
import com.example.springcxf.client.endpoint.user.UserWebService;

public class TestUserWebService extends AbstractTestCase {

	@Autowired 
	private UserWebService userWebService;
	
	@Test
	public void testCreateUser() {
		CreateUserDTO createUserDTO = new CreateUserDTO();
		createUserDTO.setId("1");
		createUserDTO.setLastName("Sok");
		createUserDTO.setFirstName("Dara");
		
		userWebService.createUser(createUserDTO);
	}
}
