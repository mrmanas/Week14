package com.gl.dao;

import java.util.List;

import com.gl.model.Employee;


public interface EmployeeDAO {
	void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee getEmployeeById(Long id);
	List<Employee> getAllEmployees();
}
