package com.project.module.service;

import java.util.List;

import com.project.module.DAO.EmployeeDAO;
import com.project.module.model.Department;
import com.project.module.model.Employee;

public class EmployeeService {

	private EmployeeDAO employeeDao;

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmployee(Department department){
		
		 employeeDao.insertEmployee(department);
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
