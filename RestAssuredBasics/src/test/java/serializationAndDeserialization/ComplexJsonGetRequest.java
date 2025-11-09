package serializationAndDeserialization;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.ComplexJsonResponseBody;
import pojo.Data;
 
import static io.restassured.RestAssured.*;

public class ComplexJsonGetRequest {

	@Test
	public void getListOfUsers() {
		RestAssured.baseURI = "https://reqres.in";

		ComplexJsonResponseBody responseObject = given()

				.queryParam("page", "2")

				.log().all()

				.when()

				.get("api/users")

				.then()

				.log().all()

				.extract()

				.response().as(ComplexJsonResponseBody.class);

		int pageValue = responseObject.getPage();

		System.out.println(pageValue);

		int totalPages = responseObject.getTotal_pages();

		System.out.println(totalPages);

		List<Data> data = responseObject.getData();

		//Data datalist = data.get(1);

		String lastname = data.get(1).getLast_name();

		System.out.println(lastname);
	}
}