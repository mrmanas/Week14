package com.gl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
    
    private String employeeName;
    private String employeeAddress;
    private String employeePhone; // Changed to String to handle phone number
    private int employeeSalary;
}
