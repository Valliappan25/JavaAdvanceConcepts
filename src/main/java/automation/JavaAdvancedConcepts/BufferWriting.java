package automation.JavaAdvancedConcepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriting {

	public static FileWriter writer;
	public static FileReader filereader;
	public static BufferedWriter buffer;
	public static BufferedReader reader;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "Files/simple.txt";
		String content = "Learning Selenium is simple"
				+ "\nLearning Testing is simple";
		
		try {
			writer = new FileWriter(location);
			buffer=new BufferedWriter(writer);
			buffer.write(content);
			buffer.close();
			writer.close();
			
			filereader = new FileReader(location);
			reader = new BufferedReader(filereader);
			String lines;
			
			while((lines = reader.readLine())!=null)
			{
				System.out.println(lines);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
