/**
 * Contains all the repositories related  to Employee management System
 */
package com.gl.ems.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.ems.entity.Employee;

/**
 * Employee Repository 
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
