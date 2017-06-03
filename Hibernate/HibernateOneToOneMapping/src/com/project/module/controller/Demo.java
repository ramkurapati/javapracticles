package com.project.module.controller;


import com.project.module.DAO.EmployeeDAOImpl;
import com.project.module.model.Employee;
import com.project.module.model.Address;
import com.project.module.service.EmployeeService;

public class Demo {
	
	public static void main(String[] args) {
		
		Address employeeAddress=new Address("1/70", "4thLane", "PA", "87443", "NY");
		Employee employee =new Employee(1290, "RAM", "K", 25000);
		employee.setEmployeeAddress(employeeAddress);
		employeeAddress.setEmployee(employee);
		EmployeeService employeeService=new EmployeeService();
		employeeService.setEmployeeDao(new EmployeeDAOImpl());
		employeeService.addEmployee(employee);
		 
		 
	}

}
