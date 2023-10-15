package com.icress.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icress.empapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}