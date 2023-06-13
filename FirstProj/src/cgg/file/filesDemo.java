package cgg.file;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filesDemo {

	public static void main(String[] args) {
		try {
		Path path = Paths.get("C:/Users/CGG/Downloads/files");
		DirectoryStream<Path> contents = Files.newDirectoryStream(path);
		for(Path content:contents) {
		       	System.out.println(content.getFileName());
		}
		contents.close();
		}
		catch(Exception e) {
			
		}

	}

}
