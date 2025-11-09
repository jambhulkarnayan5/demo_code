package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DifferentWaysAssertions {
	
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		
			given()
		
		.header("x-api-key", "PMAK-65a2da8e5bf1d26dc93c11c2-168a230ddf70a0292df80cd368d1843c5f")
		
		.when()
		
		.get("/workspaces")
		
		.then()
		
		.assertThat()
		
	   // .header("Transfer-Encoding", "chunked")
		
		.contentType(ContentType.JSON)
		
		.statusCode(200)
				
		.body("workspaces.name", contains("My Workspace", "ATTWorkspace", "Advance Workspace"))
		
		
		.body("workspaces.name", hasItem("My Workspace"))// failed as hasItem parameter doesnt match with any of the values
		
		
		.body("workspaces.name", containsInAnyOrder( "My Workspace", "ATTWorkspace", "Advance Workspace"));
	}
	
	
	

}



