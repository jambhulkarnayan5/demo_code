package serializationAndDeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateUserRequestBody;

public class Demo_Create_User2 {
	
	@Test(priority = 1)
	public void createAUser() throws JsonProcessingException {
		
		CreateUserRequestBody requestObject = new CreateUserRequestBody();
		
		requestObject.setId(0);
		requestObject.setUsername("Pojouser");
		requestObject.setFirstName("Pojo");
		requestObject.setLastName("Classes");
		requestObject.setEmail("pojo.classes@gmail.com");
		requestObject.setPassword("Test@1234");
		requestObject.setPhone("9988776655");
		requestObject.setUserStatus(0);
		
		ObjectMapper objMapper = new ObjectMapper();
		String CreateUserRequestBodyJson=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestObject);
		System.out.println(CreateUserRequestBodyJson);
		
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";

		Response responseBody = given()

						.body(requestObject)

						.header("Content-Type", "application/json")
						
						.log().all()

						.when()
						

						.post("/user")
						
						.then()
						
						.log().all()

						.extract()

						.response();


					Integer statusCode = responseBody.getStatusCode();
					
					System.out.println(statusCode);

}
}