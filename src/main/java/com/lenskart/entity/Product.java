package com.capgemini.lenskart.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private String productImage;
	private int quantity;
	private Category category;
	private String brand;
	
	
	
		
}

