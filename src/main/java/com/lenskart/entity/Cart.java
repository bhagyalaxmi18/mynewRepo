package com.capgemini.lenskart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Cart {
	
	private int id;
	private List<Product> product;
	private User customer;
	private int totalQuantity;
	private double totalPrice;
	
	
	
	
}
