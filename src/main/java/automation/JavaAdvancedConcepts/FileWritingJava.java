package automation.JavaAdvancedConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingJava {

	public static FileWriter writer;
	public static void main(String args[])
	{
		String location = "Files/simple.txt";
		String content = "Learning Java is simple";
		
		try {
			writer = new FileWriter(location);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
