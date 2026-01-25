package com.codegnan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee10 {
	
	@Value("101")
	private int eno;
	@Value("Kiran")
	private String ename;
	@Value("4000000")
	private float esal;
	@Value("Hyd")
	private String eaddr;

	public void DisplayEmpDetails() {
		System.out.println("Employee Number: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esal);
		System.out.println("Employee Address: "+eaddr);

	}
}
