package com.wu.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
	private String orderId;
	private String firstName;
	private String lastName;
	private String address;
	private String contact;	
}
