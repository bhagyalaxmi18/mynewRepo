package com.capgemini.lenskart.service;

import java.util.List;


import com.capgemini.lenskart.dto.ProductDTO;
import com.capgemini.lenskart.dto.UserDTO;


public interface AdminService {
	
	public UserDTO addAdmin(UserDTO adminDTO);
	public UserDTO updateAdmin(UserDTO adminDTO);
	public UserDTO getAdminByEmail(String  email);
	
	
	
}
