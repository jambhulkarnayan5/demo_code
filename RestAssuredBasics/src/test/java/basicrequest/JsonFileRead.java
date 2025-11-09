package basicrequest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonFileRead {
	
	@Test
	public void readFile() throws IOException {
		
		RestAssured.baseURI = "https://reqres.in/";
		byte [] inp =Files.readAllBytes(Paths.get("D:\\My Tool\\Eclipse\\Eclipse workspace\\RestAssuredBasics\\src\\test\\resources\\test1.json"));
		String input = new String (inp);

		Response response = given()
				
				.header("Content-Type", "application/json")
				.body(input)
				.log().all()

				.when()

				.post("/api/users")

				.then()

				.extract()

				.response();
		String resp = response.asPrettyString();

		System.out.println(resp);
	}
	

}
