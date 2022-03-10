package automation.JavaAdvancedConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutstream {
	
	public static FileOutputStream stream;
	
	public static void main(String args[])
	{
		String location = "Files/simple.txt";
		String content = "Learning Automation Testing FrameWork is simple!";
		try {
			stream = new FileOutputStream(location);
			
			byte[] writeThis = content.getBytes();
			stream.write(writeThis);
			stream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
