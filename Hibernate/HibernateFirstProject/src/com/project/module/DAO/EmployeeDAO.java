package com.project.module.DAO;

import java.util.List;

import com.project.module.model.Employee;

public interface EmployeeDAO {
	
	public void insertEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	public void updateEmployee(int id ,int sal);
	public void updateEmployee(Employee emp);
	public void removeEmployee(int id);

}
