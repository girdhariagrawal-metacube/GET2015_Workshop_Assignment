/**
 * @author Girdhari
 * description : class demonstrate use of custom eception
 */

package com.main;

import com.exception.InvalidEmailException;

public class Main {

	public static void main(String[] args) {
		String email = "girdhari100@gmail.com";
		try {
			verify(email);
		} catch(InvalidEmailException e) {
			System.out.println(e);
		}

	}
	
	/* verify method note all use cases are covered just for the example */
	public static void verify(String email) throws InvalidEmailException {
			if(email.indexOf('@') < 0 || (email.indexOf('@') > email.indexOf('.'))) {
				throw new InvalidEmailException("Entered Email is Invalid");
			} else {
				System.out.println("Email is correct");
			}
	}
}
