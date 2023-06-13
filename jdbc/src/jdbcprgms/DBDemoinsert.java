package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String useraname = "postgres";
		String password = "admin";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,useraname,password);
			Statement smt = conn.createStatement();
			
			int empno = Integer.parseInt(args[0]);
			String name = args[1];
			double salary = Double.parseDouble(args[2]);
			
			String insertCmd = "insert into emp values("+empno+",'"+name+"',"+salary+")";
			int cnt = smt.executeUpdate(insertCmd);
			System.out.println(cnt+"rows updated");
			smt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
