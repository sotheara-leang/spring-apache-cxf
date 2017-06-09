package com.example.springcxf.server;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.example.springcxf.server.dto.CreateUserDTO;
import com.example.springcxf.server.endpoint.UserWebService;

public class TestClient {
	
	public static void main(String[] args) {
		String serviceUrl = "http://localhost:8080/spring-apache-cxf/soap/userService";
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserWebService.class);
		factory.setAddress(serviceUrl);
		
		UserWebService bookService = (UserWebService) factory.create();

		CreateUserDTO createDTO = new CreateUserDTO();
		createDTO.setId("1");
		createDTO.setLastName("Sok");
		createDTO.setFirstName("Dara");
		
		bookService.createUser(createDTO);
		
	}
}
