package com.project.module.controller;


import com.project.module.DAO.EmployeeDAOImpl;
import com.project.module.model.Employee;
import com.project.module.model.Department; 
import com.project.module.service.EmployeeService;

public class Demo {
	
	public static void main(String[] args) {
		
		Department department=new Department();
		department.setDepotid(new Long(1016));
		department.setDepotname("Administration");
		Employee employee1 =new Employee(1290, "RAM", "K", 25000);
		employee1.setDepot(department);
		Employee employee2 =new Employee(1291, "RAJ", "L", 35000);
		employee2.setDepot(department);

		
		EmployeeService employeeService=new EmployeeService();
		employeeService.setEmployeeDao(new EmployeeDAOImpl());
		employeeService.addEmployee(employee1);
		employeeService.addEmployee(employee2);
		 
	}

}
