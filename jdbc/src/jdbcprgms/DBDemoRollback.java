package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemoRollback {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String username = "postgres";
		String password = "admin";
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			String query = "update emp set salary =65000 where empid = ?";
			PreparedStatement ps=  conn.prepareStatement(query);
			ps.setInt(1, Integer.parseInt(args[0]));
			int cnt = ps.executeUpdate();
			
			if(cnt>0) {
				System.out.println("update successful");
			}
			else
				System.out.println("no such employee");
			conn.rollback();
			System.out.println("trasaction committed");
			conn.setAutoCommit(true);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

