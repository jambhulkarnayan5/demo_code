package spotifyAPIs;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

//GetUserDetails -1 
//CreatePlalistAPI- 2

public class GetUserDetails {
	
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://api.spotify.com";
		
		given()
		
		.header("Authorization", "Bearer BQCDUQ0qBBWvhzu5Mek0rzthHVgqZz1ruBhCL_BC6Ax4ggxrZLK-CvDJvZtV92dEqf8145MfHryJSrmfc2qHabvns1H88GJZ44pkYQ-StkEb62FfyBoF3-Po7Ro9rlNxo2XsPPIIlc_hQ9UJKtoJjuM_-vxTyj8fVP3oknrF4Fz6WEBNsszS_AiYwG9VN7rHY992mzOfe5gersRhy2m_v43Ok7ArAx7tAIob_ZHRHpwhoYj1uoOwiL2sLfstIBkrLh-oo-2xgB_yyfVA")
		
		.log().all()
		.when()
		
		.get("v1/me")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
		
	}


}
