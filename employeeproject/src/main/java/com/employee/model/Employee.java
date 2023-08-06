package com.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Employee_id")
	private Integer id;
	
	@Column(name="Employee_name")
	private String name;
	
	@Column(name="Employee_salary")
	private Long salary;
	
	@Column(name="Employee_address")
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(Integer id, String name, Long salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
	}	
	
	
	
	
}
