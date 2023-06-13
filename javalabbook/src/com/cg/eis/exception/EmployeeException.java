package com.cg.eis.exception;

public class EmployeeException extends Exception {
	double sal;
	public EmployeeException(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeException [sal=" + sal + "]";
	}
	

}
