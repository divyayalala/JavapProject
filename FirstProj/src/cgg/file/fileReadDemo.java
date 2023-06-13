package cgg.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fileReadDemo {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("C:/Users/CGG/Desktop/files/csstask/assignment1.html");
		List<String> lines = Files.readAllLines(file);
		for(String line:lines) {
			System.out.println(line);
		}
		System.out.println("end of file");
		
		
	}

}
