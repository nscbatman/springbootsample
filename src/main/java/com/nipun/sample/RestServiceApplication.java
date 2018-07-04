package com.nipun.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nipun.sample.lists.GlobalLists;
import com.nipun.sample.model.UserDetails;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
		
		GlobalLists.datalist.add(new UserDetails(1,"Nipun","Chauhan","Rockdale","Sydney"));
		GlobalLists.datalist.add(new UserDetails(2,"Punit","Kumar","Rockdale","Sydney"));
	}
}
