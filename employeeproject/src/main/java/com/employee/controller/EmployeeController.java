package com.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	//Additon of Employee
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		boolean added=this.employeeService.addEmployee(employee);
		if(added)
		{
			return "Employee added successfully";
		}
		else
			return "Employee was not added";
	}
	
	//get all employee
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee()
	{
		
		return this.employeeService.getAllEmployee();
	}
	
	//get employee by id
	@GetMapping("/getemployeebyid/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId)
	{
		return this.employeeService.getEmployeeById(employeeId);
	}
	
	//update employee detail
	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee);
	}
	
	//delete employee by id
	@DeleteMapping("/deletebyId/{employeeId}")
	public String deleteById(@PathVariable Integer employeeId)
	{
		boolean deleteCheck=this.employeeService.deleteById(employeeId);
		if(deleteCheck)
		{
			return "employee deleted successfully";
		}
		else
		{
			return "employee with given id not available";
		}
	}
	
	//delete all employee
	@DeleteMapping("/deleteallemployee")
	public String deleteAllEmployee()
	{
		return this.employeeService.deleteAllEmployee();
	
	}
	
	
}
