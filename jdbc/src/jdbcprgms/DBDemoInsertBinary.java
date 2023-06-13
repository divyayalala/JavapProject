package jdbcprgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoInsertBinary {
	public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/cgg_interns";
	String username = "postgres";
	String password = "admin";
	try {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url,username,password);
		String cmd = "insert into attachment(filename,filedata) values(?,?)";
		PreparedStatement ps = conn.prepareStatement(cmd,Statement.RETURN_GENERATED_KEYS);
		
		File file = new File(args[0]);
		String name = file.getName();
		long length = file.length();
		
		ps.setString(1, name);
		FileInputStream fin =new FileInputStream(file);
		ps.setBinaryStream(2, fin,length);
		int cnt = ps.executeUpdate();
		
		if(cnt>0) {
			System.out.println(cnt+" row(s) inserted");
			ResultSet keys = ps.getGeneratedKeys();
			keys.next();
			int generatedkey = keys.getInt(1);
			System.out.println("id assigned "+generatedkey);
			keys.close();
		}
		
	
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
