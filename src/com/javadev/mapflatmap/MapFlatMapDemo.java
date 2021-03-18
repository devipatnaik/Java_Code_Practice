package com.javadev.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {

	public static void main(String[] args) {
		
		List<Customer> list = MapDataBase.getAllData();
		// List<Customer> convert to List<String>
		// map  One-to-one mapping
		List<String> email = list.stream().map(Customer::getEmail).collect(Collectors.toList());
		
		System.out.println(email);
		
		// List<Customer> convert to List<String>
		// FlatMap one-to-many mapping
		
		List<List<String>> phone = list.stream().map(Customer::getPhoneNumber).collect(Collectors.toList());
		System.out.println(phone);
		
		// List<Customer> convert to List<String>
		// FlatMap one-to-many mapping
		List<String> phoneNo = list.stream().flatMap(c -> c.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(phoneNo);
		
		
		
	}

}
