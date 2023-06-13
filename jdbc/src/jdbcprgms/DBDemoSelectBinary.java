package jdbcprgms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBDemoSelectBinary {
	public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/cgg_interns";
	String username = "postgres";
	String password = "admin";
	try {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url,username,password);
		String cmd = "select filename,filedata from attachment where id = ?";
		PreparedStatement ps = conn.prepareStatement(cmd);
		

		ps.setInt(1, Integer.parseInt(args[0]));
		ResultSet rs = ps.executeQuery();
		
		String saveDir = "./temp";
		while(rs.next()) {
			String fileName = rs.getString("filename");
			File file = new File(saveDir,fileName);
			FileOutputStream fos = new FileOutputStream(file);
			InputStream source = rs.getBinaryStream("filedata");
			byte [] buffer = new byte[8192];
			int bytesRead=0;
			while((bytesRead = source.read(buffer,0,8192))!=-1){
				fos.write(buffer,0,bytesRead);
			}
			source.close();
			fos.flush();
			fos.close();
			System.out.println("file saved as :"+file.getCanonicalPath());
		}	
	} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

