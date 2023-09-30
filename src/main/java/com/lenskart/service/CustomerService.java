package com.capgemini.lenskart.service;

import java.util.List;

import com.capgemini.lenskart.dto.CartDTO;
import com.capgemini.lenskart.dto.ProductDTO;
import com.capgemini.lenskart.dto.UserDTO;

public interface CustomerService {
	
	public UserDTO registerCustomer(UserDTO customerDTO);
	public UserDTO updateCustomer(UserDTO customerDTO);
	public boolean deleteCustomer(UserDTO customerDTO);
	public UserDTO getByEmail(String email);
	public CartDTO getCartByCustomer(int customerId);
	
	
}
