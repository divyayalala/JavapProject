package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class jdbcdemo {
 
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String username = "postgres";
		String password = "admin";
		
		//Class.forName("org.postgresql.Driver");
		//second way of registering driver with drivermanager;
		try(Connection connection = DriverManager.getConnection(url,username,password)) {
			DriverManager.registerDriver(new Driver());
			System.out.println("connection established");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
