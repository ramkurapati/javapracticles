package com.project.module.model;

import java.util.Set;

public class Department {

	private Long depotid;
	private String depotname;
	private Set<Employee> employees;
	
	public Long getDepotid() {
		return depotid;
	}
	public void setDepotid(Long depotid) {
		this.depotid = depotid;
	}
	public String getDepotname() {
		return depotname;
	}
	public void setDepotname(String depotname) {
		this.depotname = depotname;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
