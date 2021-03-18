package com.javadev.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	private int empId;
	private String empName;
	private int deptId;
	private String status = "active";
	private int salary;
}
