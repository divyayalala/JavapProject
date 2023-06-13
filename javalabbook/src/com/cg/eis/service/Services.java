package com.cg.eis.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.cg.eis.bean.employee;
import com.cg.eis.exception.EmployeeException;

interface EmployeeService{
	employee addemployee(int id, String name, double salary, String designation) throws EmployeeException;
	boolean getDetails(String insuranceScheme);
	String findInsuranceScheme(double salary,String designation);
	public boolean deleteEmployee(int id);
	public void save() throws IOException;
}


public class Services implements EmployeeService{
	HashMap<Integer,employee> employees = new HashMap<>();
	public Services(){
		File file = new File("emp.ser"); //here you make a filehandler - not a filesystem file.
		FileInputStream fis;
		try {
			if(file.exists()) {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			employees = (HashMap<Integer,employee>)ois.readObject();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	@Override
     public boolean getDetails(String insuranceScheme) {
		boolean f = false;
		for(employee e :employees.values()){
			if(e.getInsurance().equals(insuranceScheme)) {
				System.out.println("Id :"+e.getId());
				System.out.println("Nmae :"+e.getName());
				System.out.println("Designation :"+e.getDesignation());
				System.out.println("Salary :"+e.getDesignation());
				System.out.println("Insurance Scheme :"+e.getInsurance());
				System.out.println("--------------------------------");
				f = true;
			}
		}
		return f;	
	}
	@Override
	public String findInsuranceScheme(double salary,String designation) {
		if(salary>5000 && salary<20000 && designation.equals("SystemAssociate")) {
			return "Scheme C";
		}
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer")) {
			return "Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager")) {
			return "Scheme A";
		}
		else if(salary<=5000 && designation.equals("clerk")) {
			return "No Scheme";
		}
		else 
			return "";
		
	}
	@Override
	public employee addemployee(int id, String name, double salary, String designation){
		String insuranceScheme = findInsuranceScheme(salary,designation);
		System.out.println(insuranceScheme);
		employee e = new employee(id,name,salary,designation,insuranceScheme);	
		employees.put(e.getId(), e);
		return e;
	}
	public boolean deleteEmployee(int id) {
		employees.remove(id);
		return true;
	}
	public void displayAll() {
		employees.forEach((k,v)->{
			System.out.println("Id :"+v.getId());
			System.out.println("Nmae :"+v.getName());
			System.out.println("Designation :"+v.getDesignation());
			System.out.println("Salary :"+v.getDesignation());
			System.out.println("Insurance Scheme :"+v.getInsurance());
			System.out.println("--------------------------------");
		});	
	}
	public void save(){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employees);
			oos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
