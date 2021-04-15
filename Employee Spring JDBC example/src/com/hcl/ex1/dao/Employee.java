package com.hcl.ex1.dao;
public class Employee {
	private int no;
	private String name;
	private double salary;
	private String city;
	public Employee() {

	}
	public Employee(int no, String name, double salary, String city) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
