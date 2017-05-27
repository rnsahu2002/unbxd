package unbxd;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
public class Request {
	
public int postrequest(String writer)
{

	DefaultHttpClient httpClient = new DefaultHttpClient();
	try {

		HttpPost postrequest = new HttpPost("http://example.com/rules");
		postrequest.addHeader("content-type", "application/json");
		postrequest.addHeader("accept", "application/json");
		StringEntity entity = new StringEntity(writer);
		postrequest.setEntity(entity);

		HttpResponse response = httpClient.execute(postrequest);
		int statusCode = response.getStatusLine().getStatusCode();
		//ResponseHandler<String> handler = new BasicResponseHandler();
		//String output = handler.handleResponse(response);
		//System.out.println(output);

		return statusCode;

	} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	return 0;
}

	
	

	@Test
public  void Test1() {
	
	ReqPojo req = new ReqPojo();
	req.setQuery("red shirt");
	req.setStart_data("17/05/2017");
	req.setEnd_date("20/05/2017");
	req.setCampaign_name("red shirt campaign");
	Gson gson = new Gson();
	String json = gson.toJson(req);
	int statuscode =postrequest(json);

	Assert.assertEquals(statuscode, 404);
		
		
		
	}
	
	
	@Test
public  void Test2() {
	
	ReqPojo req1 = new ReqPojo();
	req1.setQuery(" ");
	req1.setStart_data("17/05/2017");
	req1.setEnd_date("20/05/2017");
	req1.setCampaign_name("red shirt campaign");
	
		Gson gson = new Gson();
		String json = gson.toJson(req1);

		int statuscode =postrequest(json);
		Assert.assertEquals(statuscode, 404);
	
	}
	

	
	


}

