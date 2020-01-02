package com.siddu.onlineshopping.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import com.siddu.shoppingbackend.dto.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user=(User) target;
		
	}

}
