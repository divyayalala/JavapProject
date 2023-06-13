package cgg.sma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cgg.sma.manage.ConnectionProvider;
import cgg.sma.model.Student;

public class StudentDAO {
	Connection conn;

	public StudentDAO() {
		super();
		conn = ConnectionProvider.createConnection();
	}
	public boolean insertStudentToDB(Student st) {
		boolean f = false;
		String q = "insert into students(student_name,student_phone,student_city) values(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setString(1, st.getsName());
			ps.setString(2, st.getsPhone());
			ps.setString(3, st.getsCity());
			ps.executeUpdate();
			f= true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;	
	}
	public boolean deleteStudent(int userId) {
		boolean f = false;
		String q = "delete from students where studentId = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(q);
			ps.setInt(1, userId);
			ps.executeUpdate();
			f= true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}
	public void showAllStudents() {
		// TODO Auto-generated method stub
		try {
			String q = "select * from students";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(q);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);
				System.out.println("Id :"+id);
				System.out.println("Name :"+name);
				System.out.println("phone No :"+phone);
				System.out.println("City :"+city);
				System.out.println("--------------");
			}
			rs.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public boolean updatestudent(Student s1) {
		boolean f = false;
		String query = "update students set student_phone=?,student_city=? where studentid = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, s1.getsPhone());
			ps.setString(2, s1.getsCity());
			ps.setInt(3, s1.getStudentId());
			ps.executeUpdate();
			f = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
}
