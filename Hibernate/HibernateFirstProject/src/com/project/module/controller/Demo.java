package com.project.module.controller;


import java.util.List;

import com.project.module.DAO.EmployeeDAOImpl;
import com.project.module.model.Employee;
import com.project.module.service.EmployeeService;

public class Demo {
	
	public static void main(String[] args) {
		
		 Employee employee1 = new Employee(1250,"kunal", "k","pune", 70900);
		 EmployeeService employeeService=new EmployeeService();
		 employeeService.setEmployeeDao(new EmployeeDAOImpl());
		 //employeeService.addEmployee(employee1);
		 
		 //System.out.println(employeeService.fetchEmployee(1237));
		 
		 //employeeService.modifyEmployee(1251, 95000);
		 employeeService.modifyEmployee(employee1);
		 //employeeService.deleteEmployee(1251);
		// List<Employee> employees=employeeService.fetchAllEmployees();
		 //System.out.println(employees);
	}

}
