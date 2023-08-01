package com.example.employee.jpa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.jpa.model.Department;
import com.example.employee.jpa.model.Employee;
import com.example.employee.jpa.service.DepartmentJpaService;
import com.example.employee.jpa.service.EmployeeJpaService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	
	@Autowired
    public DepartmentJpaService departmentService ;
	
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ArrayList<Department> getdepartment(){
		return departmentService.getDepartment();
	}
	
	@GetMapping("{departmentId}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
    public Department getDepartmentById(@PathVariable("departmentId") int departmentId){
		return departmentService.getDepartmentById(departmentId);
    } 
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Department addDepartment(@Valid @RequestBody Department department) {
		return departmentService.addDepartment(department);
	} 
	
	
}