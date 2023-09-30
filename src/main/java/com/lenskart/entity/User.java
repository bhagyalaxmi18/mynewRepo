package com.capgemini.lenskart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;



public class User {
	private int userid;
	private String userName;
	private String password;
	private String role;

	private String name;
	private String email;
	private Long number;
   	private String address;
	
	
}
