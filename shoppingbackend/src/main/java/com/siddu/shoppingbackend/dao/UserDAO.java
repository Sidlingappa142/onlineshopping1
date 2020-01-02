package com.siddu.shoppingbackend.dao;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.siddu.shoppingbackend.dto.Address;
import com.siddu.shoppingbackend.dto.Cart;
import com.siddu.shoppingbackend.dto.User;

public interface UserDAO {
	
	//add an user
	boolean addUser(User user);
	
	User getByEmail(String email);
	
	//add an address
	boolean addAddress(Address address);
	
	//alternative
    //Address getBillingAddress(int userId);
	
	//List<Address> listShippingAddress(int userId);
	Address getBillingAddress(User user);
	
	List<Address> listShippingAddress(User user);
	
	

}
