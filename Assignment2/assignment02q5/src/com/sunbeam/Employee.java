package com.sunbeam;

import java.util.Objects;

public class Employee {
	private int  empid;
	private String name;
	private int Salary;
	
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}


}
