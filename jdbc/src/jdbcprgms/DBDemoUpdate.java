package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoUpdate {
public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/cgg_interns";
	String username = "postgres";
	String password = "admin";
	try {
		Class.forName("org.postgresql.Driver");
		try(Connection conn = DriverManager.getConnection(url,username,password);Statement stm = conn.createStatement()){
			String updateCmd = "update emp set ename = 'Pop',salary = 60000 where empid = 101";
			int cnt =  stm.executeUpdate(updateCmd);
			System.out.println(cnt +"row(s) updated...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
