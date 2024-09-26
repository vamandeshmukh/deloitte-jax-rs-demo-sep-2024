//// EmployeeService.java 
package com.deloitte.demo.service;

import java.util.List;
import com.deloitte.demo.model.Employee;
import com.deloitte.demo.repository.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository employeeRepository = new EmployeeRepository();

	public Employee addEmployee(Employee employee) {
		System.out.println(employee.toString());
		return employeeRepository.addEmployee(employee);
	}

	public List<Employee> getAllEmployees() {
//		System.out.println();
		return employeeRepository.getAllEmployees();
	}

}

//package com.deloitte.demo.service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import com.deloitte.demo.model.Employee;
//
//public class EmployeeService {
//
//	private static EmployeeService instance;
//	private List<Employee> empList;
//
//	private EmployeeService() {
//		empList = new ArrayList<>(Arrays.asList(new Employee(1, "Sonu", 90.25), new Employee(2, "Monu", 95.75),
//				new Employee(3, "Tonu", 92.25)));
//	}
//
//	public static synchronized EmployeeService getInstance() {
//		if (instance == null) {
//			instance = new EmployeeService();
//		}
//		return instance;
//	}
//
//	public List<Employee> getAllEmployees() {
//		empList.forEach(System.out::println);
//		return empList;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		System.out.println(employee.toString());
//		empList.add(employee);
//		return empList.get(empList.size() - 1); // Return the added employee
//	}
//}

//
//
//package com.deloitte.demo.service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import com.deloitte.demo.model.Employee;
//
//public class EmployeeService {
//
//	private static EmployeeService instance; 
//	private List<Employee> empList;
//
//	private EmployeeService() {
//		empList = new ArrayList<>(Arrays.asList(new Employee(1, "Sonu", 90.25), new Employee(2, "Monu", 95.75),
//				new Employee(3, "Tonu", 92.25)));
//	}
//
//	public static synchronized EmployeeService getInstance() {
//		if (instance == null) {
//			instance = new EmployeeService();
//		}
//		return instance;
//	}
//
//	public List<Employee> getAllEmployees() {
//		empList.forEach(System.out::println);
//		return empList;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		System.out.println(employee.toString());
//		if (empList.add(employee))
//			return empList.get(empList.size() - 1);
//		else
//			throw new RuntimeException("Employee could not be added.");
//	}
//
//}
