package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbcreatemain2 {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/cgg_interns";
		String useraname = "postgres";
		String password = "admin";
		try(Connection conn = DriverManager.getConnection(url,useraname,password);Statement stm = conn.createStatement()) {
			Class.forName("org.postgresql.Driver");
			String dropcmd = "drop table if exists attachment";
			String createcmd = "create table attachment(id serial primary key,filename varchar(40),filedata bytea)";
			
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
