package test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotProgram {
	
   static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver= WebDriverManager.chromedriver().create();
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();

		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\My Tool\\Eclipse\\Screenshots\\amazonScreenshot_.jpg");
	    FileUtils.copyFile(source, dest);
	    
	    System.out.println("Done");
	   
	    driver.close();
	    
				

	}

}
