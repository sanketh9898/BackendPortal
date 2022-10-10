package com.employee.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import com.employee.backend.exception.ResourceNotFoundException;

import com.employee.backend.model.Employee;
import com.employee.backend.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
	}
	
	// create employee rest api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//get employee by id rest api
	@GetMapping("/employees/{EmpId}")
	public ResponseEntity<Employee> getEmployeById(@PathVariable String EmpId) {
		Employee employee = employeeRepository.findById(EmpId).orElseThrow(() -> new ResourceNotFoundException("Employee not Exist with Id:" +EmpId));
		return ResponseEntity.ok(employee);
		
	}
	
	
	//update employee rest api
	
	@PutMapping("/employees/{EmpId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable String EmpId, @RequestBody Employee employeeDetails){
		Employee employee = employeeRepository.findById(EmpId).orElseThrow(() -> new ResourceNotFoundException("Employee not Exist with Id:" +EmpId));
		employee.setName(employeeDetails.getName());
		employee.setEmail(employeeDetails.getEmail());
		employee.setPhone(employeeDetails.getPhone());
		employee.setEmpId(employeeDetails.getEmpId());
		employee.setHomeManager(employeeDetails.getHomeManager());
		employee.setLocation(employeeDetails.getLocation());
		employee.setAddress(employeeDetails.getAddress());
		employee.setSeatId(employeeDetails.getSeatId());
		employee.setWorkExp(employeeDetails.getWorkExp());
		employee.setAssetId(employeeDetails.getAssetId());
		employee.setHeadPhone(employeeDetails.getHeadPhone());
		employee.setProjectId(employeeDetails.getProjectId());
		employee.setProjectName(employeeDetails.getProjectName());
		employee.setInternet(employeeDetails.getInternet());
		employee.setAgileTeam(employeeDetails.getAgileTeam());
		employee.setSkills(employeeDetails.getSkills());
		employee.setPortfolio(employeeDetails.getPortfolio());
		employee.setSeniorDir(employeeDetails.getSeniorDir());
		employee.setLibertyExp(employeeDetails.getLibertyExp());
		employee.setCognizantExp(employeeDetails.getCognizantExp());
		employee.setStatus(employeeDetails.getStatus());
		employee.setLastWorkigDay(employeeDetails.getLastWorkigDay());
		employee.setCertification(employeeDetails.getCertification());
		employee.setLibertyApplication(employeeDetails.getLibertyApplication());
		Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
		
		
	}
	// Delete employee rest api
	@DeleteMapping("/employees/{EmpId}")
	public ResponseEntity< Map<String, Boolean>> deleteEmployee(@PathVariable String EmpId){
		
		Employee employee = employeeRepository.findById(EmpId).orElseThrow(() -> new ResourceNotFoundException("Employee not Exist with Id:" +EmpId));
		
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
	
}