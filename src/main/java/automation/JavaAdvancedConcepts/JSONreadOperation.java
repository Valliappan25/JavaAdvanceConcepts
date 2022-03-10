package automation.JavaAdvancedConcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONreadOperation {
	
	public static void main(String args[]) throws IOException, ParseException
	{
		String location = "Files/jsonfile.json";
		FileReader reader = new FileReader(location);
		
		JSONParser parser = new JSONParser();
		
		Object parsedJSON = parser.parse(reader);
		
		JSONObject json = (JSONObject) parsedJSON;
		
		System.out.println(json.get("Id").toString());
		System.out.println(json.get("Name").toString());
		
		JSONArray array = (JSONArray) json.get("Skills");
		
		Iterator itr = array.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		
		//System.out.println(json.get("Skills").toString());
	}

}
