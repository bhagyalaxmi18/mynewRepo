package com.capgemini.lenskart.service;

import com.capgemini.lenskart.dto.CartDTO;
import com.capgemini.lenskart.dto.ProductDTO;

public interface CartService {

		public CartDTO addToCart(CartDTO cartDTO);
		public CartDTO updateCart(CartDTO cartDTO);
		public String deleteProduct(ProductDTO productDTO);


	}


