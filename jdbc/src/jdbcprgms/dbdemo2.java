package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbdemo2 {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		
		Properties properties = new Properties();
		properties.put("user","postgres");
		properties.put("password", "admin");
        try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(url, properties);
			
			System.out.println("connection established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
