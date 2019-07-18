package com.app.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.employee.employee.model.Employee;
import com.app.employee.employee.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	
	public void saveEmployee(Employee emp) {
		empRepository.save(emp);
	}
	
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
		
	}
}
