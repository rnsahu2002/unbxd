package jsonManupulation;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToJson {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			String json = "";

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "mkyong");
			map.put("age", 29);

			// convert map to JSON string
			json = mapper.writeValueAsString(map);

			System.out.println(json);

json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

			// pretty print
			System.out.println(json);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}