package basicrequest;


	


	import org.testng.Assert;
import org.testng.annotations.Test;

	import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

	public class Get_Request {

		
		@Test
		public void getAllUser()
		{
			RestAssured.baseURI = "https://reqres.in/";
					
		Response response = given()	
			
							.when()
			
							.get("api/users?page=2")
			
							.then()
			
							.extract()
			
							.response();
			
		
 
		
		String resp = response.asPrettyString();
		
		System.out.println(resp);
		
	       int statuscode = response.getStatusCode();
			
			System.out.println("Https Code: "+statuscode);
			
			 Assert.assertEquals(statuscode,200,"Incorrect status code" );
			long time = response.getTime();// time taken
			
			System.out.println("Time :"+time);
		
			
			Assert.assertEquals(resp.contains("George"),true,"Check for presence of firstname");
		
		
		
			 JsonPath jp =response.jsonPath();
			 String firstName =jp.get("data[4].first_name");
			 Assert.assertEquals(firstName,"George","Check for presence of firstname." );
			 
			 
		
		}

	}




