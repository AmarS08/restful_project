package com.icress.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icress.empapi.entity.Employee;
import com.icress.empapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empId);
	}
}
