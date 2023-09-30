package com.capgemini.lenskart.service;

import java.util.List;

import com.capgemini.lenskart.dto.OrdersDTO;
import com.capgemini.lenskart.entity.User;


	public interface OrdersService {

		public OrdersDTO addOrders(OrdersDTO ordersDTO);
		public OrdersDTO updateOrders(OrdersDTO ordersDTO);
		public boolean deleteOrders(OrdersDTO ordersDTO);
		public OrdersDTO getById(int id);
		public List<OrdersDTO> findAll();
		public List<OrdersDTO> getOrderCustomerId(int customerId);
		public List<OrdersDTO>getOrderByRestaurantId(int restaurantId);

	}



