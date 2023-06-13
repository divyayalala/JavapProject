package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbcreatemain {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String useraname = "postgres";
		String password = "admin";
		try(Connection conn = DriverManager.getConnection(url,useraname,password);Statement stm = conn.createStatement()) {
			Class.forName("org.postgresql.Driver");
			String dropcmd = "drop table if exists emp";
			String createcmd = "create table emp(empid int primary key,ename varchar (40),salary numeric(12,2))";
			
			stm.execute(dropcmd);
			stm.execute(createcmd);
			
			System.out.println("table created");	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
