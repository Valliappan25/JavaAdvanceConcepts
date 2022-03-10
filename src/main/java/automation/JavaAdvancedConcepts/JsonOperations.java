package automation.JavaAdvancedConcepts;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonOperations {
	
	public static void main(String args[]) throws IOException
	{
		String location = "Files/jsonfile.json";
		JSONObject json = new JSONObject();
		json.put("Id", 1);
		json.put("Name", "Valliappan");
		
		JSONArray array = new JSONArray();
		
		array.add("JAVA");
		array.add("ManualTesting");
		array.add("Automation Testing");
		
		json.put("Skills", array);
		
		FileWriter writer = new FileWriter(location);
		
		writer.write(json.toString());
		writer.close();
		
	}

}
