package methodC;
import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUser {
	
	@Test
	public void getAUser(ITestContext context) {
		
	
		
		int id1=(Integer) context.getAttribute("user_id"); // getAttribute returns object type value it can not directly save it in 'int' variable,
		// convert it into Integer then save it into 'int' variable. 
		
		String bearertoken = "6fc21ed603cb94f7c817573e8d81118fa04d8a221373a2e1258dd48fda7b7f47";
		
		RestAssured.baseURI = "https://gorest.co.in/public/v2";
		given()
		.header("Authorization","Bearer "+ bearertoken)
		.pathParam("id",id1)
		.when()
		  .get("/users/{id}")
		  .then()
		  .statusCode(200)
		  
		  .log().all();
		

}
}