package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Person {
	private int empid;
	private String name;
	private double salary;
	
	Person(){
		
	}

	public Person(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return empid == other.empid;
	}
	
	public void AcceptPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter empid:: ");
		this.empid=sc.nextInt();
		System.out.print("enter name:: ");
		this.name=sc.nextLine();
		System.out.print("enter salary:: ");
		this.salary=sc.nextDouble();	
	}
}
