
//Example to fetch the value from one request and use it into another one to validate the data:
package basicrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class CreateUser {
			static String messagevalue;
			static String usernamevalue;
			
			Map<String,Object> hmap = new HashMap<String,Object>();
			
			
			
			
			
			

			@Test(priority = 1)
			public void createAUser() {
				RestAssured.baseURI = "https://petstore.swagger.io/v2";

				Response response = given()

						.body(hmap)

						.header("Content-Type", "application/json")
						.log().all()

						.when()

						.post("/user")

						.then()

						.extract()

						.response();
				

				String resp = response.asPrettyString();

				System.out.println(resp);

				JsonPath jp = response.jsonPath();

				int codevalue = jp.getInt("code");// 200

				System.out.println(codevalue);

				messagevalue = jp.getString("message");// 1581268527

				System.out.println("message from Create user API" + messagevalue);

				String typevalue = jp.getString("type");// unknown

				System.out.println(typevalue);
				
				

			}

			@Test(priority = 2)
			public void getUserDetails() {
				RestAssured.baseURI = "https://petstore.swagger.io/v2";

				Response response = given()

						.when()

						.get("/user/userthree")

						.then()

						.extract()

						.response();

				String resp = response.asPrettyString();

				System.out.println(resp);

				JsonPath jp = response.jsonPath();

				String idvalue = jp.getString("id");

				System.out.println("id value from Get request is " + idvalue);

				Assert.assertEquals(messagevalue, idvalue);

			}

		}



