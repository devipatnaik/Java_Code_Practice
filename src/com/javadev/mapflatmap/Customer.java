package com.javadev.mapflatmap;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {
	
	private int id;
	private String name;
	private String email;
	private List<String> phoneNumber;

}
