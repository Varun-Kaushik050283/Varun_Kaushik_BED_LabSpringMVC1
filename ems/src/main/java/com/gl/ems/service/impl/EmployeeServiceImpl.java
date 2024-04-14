/**
 * package contains all the service implementations related to EMS
 */
package com.gl.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ems.entity.Employee;
import com.gl.ems.repository.EmployeeRepository;
import com.gl.ems.service.EmployeeService;

/**
 * Service implementation for CRUD operation on Employee entity
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	/**
	 * Default constructor
	 */
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public Employee findById(Long employeeId) {		
		return employeeRepo.findById(employeeId).get();		
	}

	@Override
	public void deleteById(Long employeeId) {
		employeeRepo.deleteById(employeeId);
	}
	
	

}
