package unbxd;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonToOtherJSONParse {

	public static void main(String[] args) {

		String input = "{\"group1-param1\":true,\"group1-param2\":false,\"group2-param1\":false,\"group2-param2\":true,\"param1\":false,\"param2\":true}";

		JSONObject json = new JSONObject(input);

		JSONObject jsonOutput = new JSONObject();

		Set<String> keys = json.keySet();

		System.out.println(keys);

		for (String key : keys) {
			if (key.contains("-")) {
				String[] key1 = key.split("-");

				JSONArray innerJsonArry = new JSONArray();
				if (jsonOutput.has(key1[0])) 
				{
					innerJsonArry = jsonOutput.getJSONArray(key1[0]);
				}
				JSONObject innerJson = new JSONObject();
				innerJson.put("name", key1[1]);
				innerJson.put("checked", json.get(key));
				innerJsonArry.put(innerJson);
				jsonOutput.put(key1[0], innerJsonArry);
			} else {
				
				JSONArray innerJsonArry = new JSONArray();
				if (!jsonOutput.has("general")) {
					innerJsonArry = new JSONArray();
				} else {
					innerJsonArry = jsonOutput.getJSONArray("general");
				}
				JSONObject innerJson = new JSONObject();
				innerJson.put("name", key);
				innerJson.put("checked", json.getBoolean(key));
				innerJsonArry.put(innerJson);
				jsonOutput.put("general", innerJsonArry);
			}

		}

		System.out.println("jsoninput::" + json.toString(2));
		System.out.println("jsonOutput::" + jsonOutput.toString(2));

	}

	
}
