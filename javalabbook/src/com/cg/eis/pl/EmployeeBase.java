package com.cg.eis.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.eis.bean.employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.Services;



public class EmployeeBase {
	public static void main(String [] args) throws NumberFormatException, IOException{
	Services s1 = new Services();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true) {
		System.out.println("Press 1 to add employee");
		System.out.println("Press 2 to delete employee");
		System.out.println("Press 3 to dispaly all employee");
		System.out.println("press 4 to display employee details based on IssuranceScheme");
		System.out.println("Press 5 to exit");
		System.out.println("Enter your choice : ");
		int ch = Integer.parseInt(br.readLine());
	    if(ch==1) {
		System.out.println("Enter Id :");int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Name :");String name = br.readLine();
		double sal;
		try {
		System.out.println("Enter salary : ");sal = Double.parseDouble(br.readLine());
		if(sal<3000)
			throw new EmployeeException(sal);
		}
		
		catch(EmployeeException e) {
			System.out.println(e.toString());
			return;
		}
		System.out.println("Enter designation :"); String desig = br.readLine();
		employee e = s1.addemployee(id,name,sal,desig);
	    }
	    else if(ch == 2) {
	    	System.out.println("Enter id to delete the employee:");
	    	int id = Integer.parseInt(br.readLine());
	    	boolean result =s1.deleteEmployee(id);
	    	if(result) {
	    		System.out.println("Employee with id "+id+"deleted");
	    	}
	    	else {
	    		System.out.println("something went wrong");
	    	}
	    }
	    else if(ch == 3) {
	    	s1.displayAll();
	    }
	    else if(ch == 4) {
	    	System.out.println("Enter Insurance scheme to get the details :");
	    	String insuranceScheme = br.readLine();
	    	boolean result = s1.getDetails(insuranceScheme);
	    	if(!result) {
	    		System.out.println("No employee with "+insuranceScheme);
	    	}
	    }
	    if(ch==5) {
	    	s1.save();
	    	break;
	    }
	}
	System.out.println("Thank you");
	}
}
//		String filepath = "data.ser";
//		FileOutputStream fileout;
//		try {
//			fileout = new FileOutputStream(filepath);
//			ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
//			objectOut.writeObject(e);
//			System.out.println("Enter id to get object");
//			int id1 = scan.nextInt();
//			FileInputStream filein = new FileInputStream(filepath);
//			ObjectInputStream objectin = new ObjectInputStream(filein);
//			while(true) {
//				employee e1 = (employee) objectin.readObject();
//				if(e1.getId() == id1) {
//					s1.getDetails(e1);
//					break;
//				}
//				
//			}
//			fileout.close();
//			objectOut.close();
//			filein.close();
//			objectin.close();
//		} 
//		catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
//		catch (IOException e1) {
//			e1.printStackTrace();
//		} catch (ClassNotFoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
