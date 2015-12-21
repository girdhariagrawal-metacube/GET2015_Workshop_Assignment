package com.controller;

import com.model.User;

public class MainController {

	public static void main(String[] args) {
		
		/* creation of object without any parameter
		User userObject = new User();
		*/
		
		/* Creation of object in which fields are mandatory */
		User userObject = new User(1,"Girdhari Agrawal","girdhari.agrawal@metacube.com");
	}
}
