package com.project.module.service;

import java.util.List;

import com.project.module.DAO.EmployeeDAO;
import com.project.module.model.Employee;
import com.project.module.model.Address;

public class EmployeeService {

	private EmployeeDAO employeeDao;

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmployee(Employee employee){
		
		 employeeDao.insertEmployee(employee);
	}
	public Employee fetchEmployee(int id){
		return employeeDao.getEmployee(id);
		
	}
	public List<Employee> fetchAllEmployees(){
		return employeeDao.getAllEmployees();
		
	}
	public void modifyEmployee(int id ,int sal){
		employeeDao.updateEmployee(id, sal);
	}
	public void modifyEmployee(Employee emp){
		employeeDao.updateEmployee(emp);
	}
	public void deleteEmployee(int id){
		employeeDao.removeEmployee(id);
	}

	
	
	
	
	
}
