package com.project.module.controller;


import java.util.HashSet;
import java.util.Set;

import com.project.module.DAO.EmployeeDAOImpl;
import com.project.module.model.Employee;
import com.project.module.model.Department; 
import com.project.module.service.EmployeeService;

public class Demo {
	
	public static void main(String[] args) {
		
		Department department=new Department();
		department.setDepotid(new Long(1090));
		department.setDepotname("Accounts");
		
		Employee employee1 =new Employee(1400, "Guna", "U", 29000);
		//Employee employee2 =new Employee(1291, "RAJ", "L", 35000);
		Set<Employee> employeeSet=new HashSet<>();
		employeeSet.add(employee1);
		//employeeSet.add(employee2);
		department.setEmployees(employeeSet);
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.setEmployeeDao(new EmployeeDAOImpl());
		employeeService.addEmployee(department);
		 
		 
	}

}
