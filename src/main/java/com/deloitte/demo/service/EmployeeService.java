package com.deloitte.demo.service;

import java.util.Arrays;
import java.util.List;

import com.deloitte.demo.model.Employee;

public class EmployeeService {

	private List<Employee> empList = Arrays.asList(new Employee(1, "Sonu", 90.25), new Employee(2, "Monu", 95.75),
			new Employee(3, "Tonu", 92.25));

	public List<Employee> getAllEmployees() {
		empList.forEach(System.out::println);
		return empList;
	}

}
