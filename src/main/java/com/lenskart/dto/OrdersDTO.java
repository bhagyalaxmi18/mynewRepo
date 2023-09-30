package com.capgemini.lenskart.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrdersDTO {

	private int orderId;
	private LocalDateTime date;
	private enum status {Delivered,Pending,Inprogress};
	private CartDTO cart;
	
	
}
