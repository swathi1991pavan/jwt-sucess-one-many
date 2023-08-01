package com.example.employee.jpa.repository;

import java.util.ArrayList;


import com.example.employee.jpa.model.Employee;

public interface EmployeeRepository {
	
	ArrayList<Employee> getEmployees();
	
	Employee addEmployee(Employee employee);
	
	Employee getEmployeeById(Integer employeeId) ;
	
    Employee updateEmployee(Integer employeeId,Employee employee);
	
	void deleteEmployee(Integer employeeId);
	
	

}
