package cgg.sma.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cgg.sma.dao.StudentDAO;
import cgg.sma.model.Student;

public class StudentManage {
	
	static StudentDAO studentDAO = new StudentDAO();

	public static void main(String[] args) {
		System.out.println("welcome to student application");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to update student");
			System.out.println("Press 3 to Delete student");
			System.out.println("Press 4 to display All students");
			System.out.println("press 5 to exit");
			
			System.out.println("Enter your choice");
			try {
				int ch = Integer.parseInt(br.readLine());
				if(ch==1) {
					//add student
					System.out.println("Enter student name:");
					String name = br.readLine();
					System.out.println("Enter student phonenum:");
					String phone = br.readLine();
					System.out.println("Enter student city:");
					String city = br.readLine();
					Student student = new Student(name,phone,city);
					boolean answer = studentDAO.insertStudentToDB(student);
					if(answer) {
						System.out.println("student added successfully....");
					}
					else
						System.out.println("Something went wrong");
				}
				else if(ch==2) {
					//update student
					System.out.println("Enter student id :");
					int userid = Integer.parseInt(br.readLine());
					System.out.println("Enter student name :");
					String name = br.readLine();
					System.out.println("Enter new phone number :");
					String phonenum = br.readLine();
					System.out.println("Enter new city :");
					String city = br.readLine();
					Student s1 = new Student(userid,name,phonenum,city);
					boolean answer = studentDAO.updatestudent(s1);
					if(answer) {
						System.out.println("updated successfully...");
					}
					else
						System.out.println("something went wrong...");
					
				}
				else if(ch==3) {
					//delete studento
				     System.out.println("Enter student id to delete");
				     int userid = Integer.parseInt(br.readLine());
				     boolean answer = studentDAO.deleteStudent(userid);
				     if(answer) {
				    	 System.out.println("student deleted...");
				     }
				     else
				        System.out.println("something went wrong...");
				}
				else if(ch==4) {
					//display all students1
					studentDAO.showAllStudents();
				}
				else if(ch==5) {
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println("Thank you for using this app");
		System.out.println("See u soon....Bye Bye");

	}

}
