package com.capgemini.lenskart.dto;

import java.util.List;

import com.capgemini.lenskart.entity.Product;
import com.capgemini.lenskart.entity.User;

public class CartDTO {
	
	private int id;
	private List<Product> product;
	private User customer;
	private int totalQuantity;
	private double totalPrice;
}

