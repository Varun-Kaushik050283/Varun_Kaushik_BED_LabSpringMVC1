/**
 * Contains all the services related to EMS
 */
package com.gl.ems.service;

import java.util.List;

import com.gl.ems.entity.Employee;

/**
 * Employee Service
 */
public interface EmployeeService {

	public List<Employee> findAll();

	public void save(Employee employee);
	
	public Employee findById(Long employeeId);
	
	public void deleteById(Long employeeId);

}
