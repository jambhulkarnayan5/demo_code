package methodC;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateUser {
	
	@Test
	public void createAUser(ITestContext context) {
		
		Faker faker = new Faker();
		
		Map<String,Object> hmap = new HashMap<String,Object>();
		
	//	JSONObject hmap = new JSONObject();		
		hmap.put("name",faker.name().fullName());
		hmap.put("gender", "Male");
		hmap.put("email", faker.internet().emailAddress());
		hmap.put("status", "inactive");
		
		
		String bearertoken = "6fc21ed603cb94f7c817573e8d81118fa04d8a221373a2e1258dd48fda7b7f47";

		
	
	
	//RestAssured.baseURI = "https://gorest.co.in/public/v2";
	
	Response response=  given()
			           .body(hmap)
			         //  .header("Content-Type", "application/json")
			           .header("Authorization","Bearer "+ bearertoken)
			           .contentType("application/json")
			           .log().all()
			         
						.when()

						.post("https://gorest.co.in/public/v2/users")
						//.jsonPath().getInt("id");
	                //System.out.println("Generated ID: "+id);

						.then()

						.extract()

						.response();
	
	 System.out.println("Response: ");

				String resp = response.asPrettyString();

				System.out.println(resp);

				JsonPath jp = response.jsonPath();

				int id = jp.getInt("id");

				System.out.println("Generated ID: "+id);
				
				  int statuscode = response.getStatusCode();
					
					System.out.println("Https Code: "+statuscode);
	                
	                context.setAttribute("user_id", id);
			
		           
			         

}
}