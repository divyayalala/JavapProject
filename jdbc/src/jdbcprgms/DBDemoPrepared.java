package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DBDemoPrepared {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String username = "postgres";
		String password = "admin";
		try {
			Class.forName("org.postgresql.Driver");
			try(Connection conn = DriverManager.getConnection(url,username,password)){
			    PreparedStatement stm = conn.prepareStatement("insert into emp values(?,?,?)");
			    stm.setInt(1, 121);
			    stm.setString(2, "jill");
			    stm.setDouble(3, 50000);
			    int cnt = stm.executeUpdate();
			    
			    System.out.println("inserted");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	      }
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		

	}

}
}
