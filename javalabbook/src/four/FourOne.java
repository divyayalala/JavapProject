package four;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FourOne {
public static void main(String[] args) throws IOException,FileNotFoundException {
	FileReader reader = new FileReader("read.txt");
	StringBuilder sb = new StringBuilder();
			
	int value;
	while((value = reader.read())!=-1) {
		sb.append((char)value);
	}
	sb.reverse();
	FileWriter writer = new FileWriter("write.txt");
	writer.write(sb.toString());
	writer.close();
	reader.close();
	}
}
