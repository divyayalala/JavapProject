package cgg.file;
import java.io.Serializable;
import java.io.*;
	
class student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rollno;
	private String sname;
	public student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		
	}
	public String toString() {
		return "Rollno:"+rollno+"Student name is :"+sname;
	}
	
}

public class serializable {

	public static void main(String[] args) {
		
		try {
			FileOutputStream writer = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(writer);
			
			
			student s1 = new student(12,"ABC");
			System.out.println("student object s1"+s1);
			
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			student s2;
			FileInputStream fis = new FileInputStream("student.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s2 = (student)ois.readObject();
			
			System.out.println("student object s2 :"+s2);
			ois.close();
		}
		catch(Exception e) {
			
		}

	}

}
