package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	//adding employee
	@Override
	public boolean addEmployee(Employee employee) {
		return this.employeeRepository.save(employee) != null;
	}

	//get all employee
	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	//get employee by id
	@Override
	public Employee getEmployeeById(Integer Id) {
		return this.employeeRepository.findById(Id).get();
	}

	
	//updated the given employee
	@Override
	public Employee updateEmployee(Employee employee) {
		
		Optional<Employee> optional=this.employeeRepository.findById(employee.getId());
		if(optional.isPresent())
		{
			Employee updateemployee=optional.get();
			updateemployee.setName(employee.getName());
			updateemployee.setSalary(employee.getSalary());
			updateemployee.setAddress(employee.getAddress());
			employeeRepository.save(updateemployee);
			return updateemployee;
		}
		else
		return null;
	}

	//delete by employee id
	@Override
	public boolean deleteById(Integer employeeId) {
		Optional<Employee> optional;
		if((optional=employeeRepository.findById(employeeId)).isPresent())
		{
			employeeRepository.deleteById(employeeId);
			return true;
		}
		else
		{
		return false;
		}
	}

	@Override
	public String deleteAllEmployee() {
	employeeRepository.deleteAll();
	return "All employee deleted successfully";
	}
	
}
