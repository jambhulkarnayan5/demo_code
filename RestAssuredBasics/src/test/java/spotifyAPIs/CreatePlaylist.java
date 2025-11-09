package spotifyAPIs;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
	
	
		public class CreatePlaylist {
			RequestSpecification requestspecification;
			 ResponseSpecification    responsespecification;
			
			@BeforeClass
			public void reqResSpec()
			{
				RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
				
				requestspecbuilder.setBaseUri("https://api.spotify.com");
				requestspecbuilder.setBasePath("/v1/users");
				requestspecbuilder.setContentType(ContentType.JSON);
				requestspecbuilder.addHeader("Authorization", "Bearer BQCDUQ0qBBWvhzu5Mek0rzthHVgqZz1ruBhCL_BC6Ax4ggxrZLK-CvDJvZtV92dEqf8145MfHryJSrmfc2qHabvns1H88GJZ44pkYQ-StkEb62FfyBoF3-Po7Ro9rlNxo2XsPPIIlc_hQ9UJKtoJjuM_-vxTyj8fVP3oknrF4Fz6WEBNsszS_AiYwG9VN7rHY992mzOfe5gersRhy2m_v43Ok7ArAx7tAIob_ZHRHpwhoYj1uoOwiL2sLfstIBkrLh-oo-2xgB_yyfVA");
				requestspecbuilder.log(LogDetail.ALL);
				requestspecification = requestspecbuilder.build();
				
				
				 ResponseSpecBuilder responsespecbuilder = new ResponseSpecBuilder();
					
				responsespecbuilder.expectContentType(ContentType.JSON);
				responsespecbuilder.log(LogDetail.ALL);
				responsespecification	=  responsespecbuilder.build();
				
			}
			
			
			
			@Test
			public void createPlayList()
			 {
				
				given(requestspecification)
				
				 .body("{\r\n"
						+ "    \"name\": \"Classic old 2022\",\r\n"
						+ "    \"description\": \"Latest songs collection of 2022\",\r\n"
						+ "    \"public\": false\r\n"
						+ "}")
				
				 .when()
				
				 .post("/31mv476rxihnf2uducbrusw6j4fm/playlists")
				
				 .then()
				
				 .spec(responsespecification)
				
				 .body("name", equalTo("Classic old 2022"));
				
				
				
			 }

		}



