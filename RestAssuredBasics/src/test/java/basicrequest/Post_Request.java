package basicrequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_Request {
	@Test
	public void getUserDetails() throws Exception, IOException
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		JSONObject request = new JSONObject();
		
		{
			
			File excelSheet= new File("D:\\My Tool\\Eclipse\\Eclipse workspace\\MavenProject\\src\\test\\resources\\Testdata\\Data.xlsx");
			FileInputStream input = new FileInputStream(excelSheet);
			String d= WorkbookFactory.create(input).getSheet("Login").getRow(0).getCell(1).getStringCellValue();
			int d1= (int) WorkbookFactory.create(input).getSheet("Login").getRow(0).getCell(1).getNumericCellValue();

			System.out.println(d);
		}
		
		
		
		

}
}