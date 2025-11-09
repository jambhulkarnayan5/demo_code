package basicrequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Get_Header_StatusCode {

	@Test
	public void getAllUser() {
		RestAssured.baseURI = "https://reqres.in/";

		Response response=	 given()

				.when()

				.get("api/users?page=2")

				.then()
			
				
				 .extract()

				.response();
	
	           

		String resp = response.asPrettyString();

		System.out.println("Response: "+resp);
		
		String contentType = response.getHeader("Content-Type");
	
    System.out.println("Value of Content-Type : "+contentType);
    
   Headers headersList = response.getHeaders();
   
   
   for(Header header:headersList) 
   {
	   
	   System.out.println(header.getName()+":"+header.getValue());
	   
   }
      SoftAssert softAssert = new SoftAssert();
   
      softAssert.assertEquals(contentType, "application/json; charset=utf-8"," Header content type is mismatch.");	
       
       
       int statuscode = response.getStatusCode();
    
      
       softAssert.assertEquals(statuscode, 200, "Incorrect status code.");
      
      String statusLine = response.getStatusLine();
      
      
     
      softAssert.assertEquals(statusLine, "HTTP/1.1 200 OK","Incorrect status line");
      
      softAssert.assertAll("Softassert failed");
      
      
      
      
	}
	
	
	
	
}
