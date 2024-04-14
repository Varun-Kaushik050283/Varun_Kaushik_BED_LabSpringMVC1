/**
 * controller package
 */
package com.gl.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.ems.entity.Employee;
import com.gl.ems.service.EmployeeService;

/**
 * Employee Controller
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Default constructor
	 */
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/list")
	public String listEmployees(Model model) {

		// getting list of employees from DB
		List<Employee> employees = employeeService.findAll();

		// setting list of employees in model
		model.addAttribute("employees", employees);

		// returning the list_employee form
		return "employees/list_employee";
	}

	@RequestMapping("/add")
	public String addEmployee(Model model) {

		// Instantiating an employee object
		Employee employee = new Employee();

		// adding new instance of employee to the model
		model.addAttribute("employee", employee);

		// returning the employee-form
		return "employees/employee_form";

	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {

		// saving the user inputs received in Model attribute Employee
		employeeService.save(employee);

		// redirecting to list-employee form
		return "redirect:/employee/list";
	}

	@RequestMapping("/update")
	public String updateEmployee(@RequestParam("employeeId") Long employeeId, Model model) {

		// find the employee by Id
		Employee employee = employeeService.findById(employeeId);

		// setting the employee in the model
		model.addAttribute("employee", employee);

		// returning the employee-form
		return "employees/employee_form";
	}

	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") Long employeeId) {

		// deleting an employee by Id
		employeeService.deleteById(employeeId);

		// returning the list_employee form
		return "redirect:/employee/list";
	}

}
