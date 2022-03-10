package automation.JavaAdvancedConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	public static void main(String args[]) throws IOException
	{
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		FileReader read = new FileReader("Files/file.csv");
		
		BufferedReader reader = new BufferedReader(read);
		
		String rowList;
		
		while((rowList = reader.readLine())!=null)
		{
			String[] line = rowList.split(",");
			
			data.add(line);
		}
		
		for(String[] list : data)
		{
			for(String items: list)
			{
				System.out.print(items+"\t");
			}
			System.out.println();
		}
	}

}
