package com.cg.eis.bean;
import java.io.Serializable;

import com.cg.eis.exception.EmployeeException;

public class employee implements Serializable {
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	public employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setSalary(double salary){
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public employee(int id, String name, double salary, String designation,String insuranceScheme){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public String getInsurance() {
		// TODO Auto-generated method stub
		return insuranceScheme;
	}
}
