package jsonManupulation;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;



import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			String json = "{\"name\":\"mkyong\", \"age\":29}";
			Map<String, Object> map = new HashMap<String, Object>();
			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
			System.out.println(map);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}