package com.example.springcxf.server.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateUserDTO implements Serializable {

	private static final long serialVersionUID = 2306390660372411005L;
	
	private String id;
	private String lastName;
	private String firstName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", lastName=" + lastName + ", firstName="
				+ firstName + "]";
	}
}
