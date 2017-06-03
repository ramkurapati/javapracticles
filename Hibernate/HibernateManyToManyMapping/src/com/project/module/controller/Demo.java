package com.project.module.controller;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.project.module.DAO.EmployeeDAOImpl;
import com.project.module.model.Employee;
import com.project.module.model.Meeting;
import com.project.module.service.EmployeeService;

public class Demo {
	
	public static void main(String[] args) {
		
		Meeting meeting1=new Meeting();
		meeting1.setMeetingId("1G289009");
		meeting1.setMeetingName("Scrum Meeting");
		meeting1.setMeetingTime(new Date());
		
		Meeting meeting2=new Meeting();
		meeting2.setMeetingId("1G289778");
		meeting2.setMeetingName("TownHall Meeting");
		meeting2.setMeetingTime(new Date());
		
		Employee employee1 =new Employee(1290, "RAM", "K", 25000);
		Employee employee2 =new Employee(1291, "RAJ", "L", 35000);
		Set<Meeting> meetingSet=new HashSet<>();
		meetingSet.add(meeting1);
		meetingSet.add(meeting2);
		employee1.setMeetings(meetingSet);
		
		Set<Meeting> meetingSet2=new HashSet<>();
		meetingSet2.add(meeting1);
		employee2.setMeetings(meetingSet2);
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.setEmployeeDao(new EmployeeDAOImpl());
		employeeService.addEmployee(employee1);
		employeeService.addEmployee(employee2);
		 
		 
	}

}
