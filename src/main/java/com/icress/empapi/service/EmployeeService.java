package com.icress.empapi.service;

import java.util.List;

import com.icress.empapi.entity.Employee;


public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee createEmployee(Employee employee);

	public Employee getEmployeeById(Long empId);

	public Employee updateEmployeeById(Employee employee);

	public void deleteEmployeeById(Long empId);
}
