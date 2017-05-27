package unbxd;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class JStoJS {

	public static void main(String[] args) {
	
		String input = "{\"group1-param1\":true,\"group1-param2\":false,\"group2-param1\":false,\"group2-param2\":true,\"param1\":false,\"param2\":true}";

		JSONObject json = new JSONObject(input);
		JSONObject jsonOutput =new JSONObject();
		
		Set<String> keys = json.keySet();
		
		for(String k:keys)
		{
			JSONArray innerJsonArry = new JSONArray();
			JSONObject inner = new  JSONObject();
			if(k.contains("-"))
			{
			String[] head =k.split("-");


					inner.put("name", head[1]);
			inner.put("checked", json.get(k));
			innerJsonArry.put(inner);
			jsonOutput.put(head[0], innerJsonArry);

		   }
			else
			{
				JSONObject innerJson = new JSONObject();
				innerJson.put("name",k );
				innerJson.put("checked", json.get(k));
				innerJsonArry.put(innerJson);
				jsonOutput.put("General", innerJsonArry);

			
			}
			}
		
		System.out.println(jsonOutput.toString(2));
			
		}	
	}