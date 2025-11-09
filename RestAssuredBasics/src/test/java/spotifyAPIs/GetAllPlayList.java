package spotifyAPIs;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAllPlayList {
		
		
		@Test
		public void getAllPlaylist()
		{
			RestAssured.baseURI = "https://api.spotify.com/v1/me/playlists";
			
			given()
			
			.header("Authorization", "Bearer BQCDUQ0qBBWvhzu5Mek0rzthHVgqZz1ruBhCL_BC6Ax4ggxrZLK-CvDJvZtV92dEqf8145MfHryJSrmfc2qHabvns1H88GJZ44pkYQ-StkEb62FfyBoF3-Po7Ro9rlNxo2XsPPIIlc_hQ9UJKtoJjuM_-vxTyj8fVP3oknrF4Fz6WEBNsszS_AiYwG9VN7rHY992mzOfe5gersRhy2m_v43Ok7ArAx7tAIob_ZHRHpwhoYj1uoOwiL2sLfstIBkrLh-oo-2xgB_yyfVA")
		
			.when()
			
			.get()
			
			.then()
			
			.log().all()
			
			.extract()
			
			
			
			.response();
		
		}

	}



