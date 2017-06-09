package com.example.springcxf.server.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.springcxf.server.dto.CreateUserDTO;

@WebService
public interface UserWebService {
 
	@WebMethod
	void createUser(CreateUserDTO createUserDTO);
	
}
