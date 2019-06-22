package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository dao;

	public List<Employee> getEmployees() {
		return dao.findAll();
	}

	public Optional<Employee> getEmployeeById(int empid) {
		return dao.findById(empid);
	}

	public Employee addNewEmployee(Employee emp) {
		return dao.save(emp);
	}
	public List<Employee> addAllEmployee(List<Employee> emp) {
		return dao.saveAll(emp);
	}

	public Employee updateEmployee(Employee emp) {
		return dao.save(emp);
	}

	public void deleteEmployeeById(int empid) {
		dao.deleteById(empid);
	}

	public void deleteAllEmployees() {
		dao.deleteAll();
	}
	public List<Employee> findAllusingSort(Sort sort){
		return dao.findAll(sort);
	}
}
