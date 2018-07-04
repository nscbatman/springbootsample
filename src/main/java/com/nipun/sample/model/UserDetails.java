/**
 * 
 */
package com.nipun.sample.model;

import org.springframework.stereotype.Component;

/**
 * @author nipun
 *
 */
@Component
public class UserDetails {
	
	public int id;
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public UserDetails(int id, String firstName, String lastName, String address, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
	}
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
