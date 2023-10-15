package com.icress.empapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icress.empapi.entity.Employee;
import com.icress.empapi.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empservice;

	@PostMapping("api/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee emp = empservice.createEmployee(employee);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	@GetMapping("api/employee")
	public ResponseEntity<List<Employee>> findAllEmployee() {
		List<Employee> employeeList = empservice.getAllEmployees();
		return new ResponseEntity<>(employeeList,HttpStatus.OK);
	}
	@GetMapping("api/employee/{empId}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable(value="empId")long empId) {
		Employee employeeList = empservice.getEmployeeById(empId);
		return new ResponseEntity<>(employeeList,HttpStatus.OK);
	}
	@PutMapping("api/employee/{empId}")
	public ResponseEntity<Employee> UpdateEmployee(@PathVariable(value="empId") long empId,@RequestBody Employee emp){
		emp.setEmpId(empId);
		Employee responemp = empservice.updateEmployeeById(emp);
		return new ResponseEntity<>(responemp,HttpStatus.OK);
	}
	@DeleteMapping("api/employee/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(value="empId")long empId){
		empservice.deleteEmployeeById(empId);
		String message = "Employee with Id "+empId+" Deleted succcessfully!!";
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
