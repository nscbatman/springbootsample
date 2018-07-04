/**
 * 
 */
package com.nipun.sample.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.nipun.sample.lists.GlobalLists;
import com.nipun.sample.model.UserDetails;

/**
 * @author nipun
 *
 */
@Service
public class DataService {
	
	
	public List<UserDetails> getAllUsers()
	{
		return GlobalLists.datalist;
	}
	
	public List<UserDetails> getOneUserById(int id)
	{
		return GlobalLists.datalist.stream().filter(ac -> ac.getId()==id)
				.collect(Collectors.toList());
	}
	
	public String setUserDetails(UserDetails user)
	{
		GlobalLists.datalist.add(user);
		return "Success";
	}
	
	public String updateUserDetails(UserDetails user)
	{
		for(UserDetails userdetails:GlobalLists.datalist)
		{
			if(userdetails.getId()==user.getId())
			{
				userdetails.setAddress(user.getAddress());
				userdetails.setCity(user.getCity());
				userdetails.setFirstName(user.getFirstName());
				userdetails.setLastName(user.getLastName());
				return "Success";
			}
		}
		
		return "No user to update";
	}
	
	public String deleteUser(int id)
	{
		for(UserDetails userDetails:GlobalLists.datalist)
		{
			if(userDetails.getId()==id)
			{
				GlobalLists.datalist.remove(userDetails);
				return "Success";
			}
		}
			return "Did not find user to delete";
	}
}
		
