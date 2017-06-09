package com.example.springcxf.server.endpoint.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.springcxf.server.dto.CreateUserDTO;
import com.example.springcxf.server.endpoint.UserWebService;

@WebService(endpointInterface = "com.example.springcxf.server.endpoint.UserWebService")
public class UserWebServiceImpl implements UserWebService {

	private final Logger logger = LoggerFactory.getLogger(UserWebServiceImpl.class);
	
	@Override
	public void createUser(CreateUserDTO createUserDTO) {
		logger.debug(createUserDTO.toString());
		
	}
}
