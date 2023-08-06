package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
//add employee in database
public boolean addEmployee(Employee employee);

//get all the employee
public List<Employee> getAllEmployee();

//get employee by their id
public Employee getEmployeeById(Integer Id);

//update employee
public Employee updateEmployee(Employee employee);

public boolean deleteById(Integer employeeId);

public String deleteAllEmployee();
}
