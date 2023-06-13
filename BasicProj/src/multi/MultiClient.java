package multi;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;

public class MultiClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s1 = new Socket("localhost",999);
		BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
		s1.close();
		
	}

}