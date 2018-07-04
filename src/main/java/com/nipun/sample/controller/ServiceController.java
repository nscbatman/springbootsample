/**
 * 
 */
package com.nipun.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nipun.sample.model.UserDetails;
import com.nipun.sample.service.DataService;

/**
 * @author nipun
 *
 */
@RestController
@RequestMapping("nsc/services")
public class ServiceController {
	
	@Autowired
	DataService dataservice;
	
	@RequestMapping(value="/getAllUsers")
	public List<UserDetails> getAllUsers()
	{
		return dataservice.getAllUsers();
	}
	
	@RequestMapping(value="/getUser")
	public List<UserDetails> getOneUser(@RequestParam(value="id") int id)
	{
		return dataservice.getOneUserById(id);
	}
	
	@RequestMapping(value="/setUser", method=RequestMethod.POST)
	public String setUser(@RequestBody UserDetails userDetails)
	{
		return dataservice.setUserDetails(userDetails);
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.PUT)
	public String updateUser(@RequestBody UserDetails userDetails)
	{
		return dataservice.updateUserDetails(userDetails);
	}

	@RequestMapping(value="/deleteUser", method=RequestMethod.DELETE)
	public String updateUser(@RequestParam(value="id") int id)
	{
		return dataservice.deleteUser(id);
	}
	
}
