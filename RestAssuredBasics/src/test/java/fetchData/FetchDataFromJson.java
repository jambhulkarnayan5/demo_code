//Example 2 for getting the data from complex json:

package fetchData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class FetchDataFromJson {
	
	
		
			
			@Test
			public void fetchDetailsFromJson()
			{
				RestAssured.baseURI = "https://reqres.in/";
				
				
				Response response = given()
				
				.when()
				
				.get("/api/users/2")
				
				.then()
				
				.extract()
				
				.response();
			
				
				JsonPath jp = response.jsonPath();
				
			String firstname = jp.getString("data.first_name");
			
			System.out.println(firstname);
				
				
			}
			
			@Test
			public void fetchDetailsFromJson2()
			{
				RestAssured.baseURI = "https://reqres.in/";
				
				
				Response response = given()
				
				.when()
				
				.get("/api/users?page=2")
				
				.then()
				
				.extract()
				
				.response();
			
				
				JsonPath jp = response.jsonPath();
				
			int pagevalue = jp.getInt("page");
			
			System.out.println(pagevalue);
			
		//	WAP to fetch the email address of the person whose lastname is fergusson:
			
			int size = jp.getInt("data.size()");
			System.out.println(size);
			
			for(int i=0; i<size; i++)
			{
				String lastname = jp.getString("data["+i+"].last_name");
				
			//	System.out.println(lastname);
				
				if(lastname.equals("Ferguson"))
				{
					String email = jp.getString("data["+i+"].email");
					
					System.out.println(email);
				}
			}
			
			
				

			}


		}


