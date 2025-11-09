package test;


import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		//options.setExperimentalOption( "excludeSwitches", Collections.singletonList("enable-automation"));
		options.addArguments("disable-infobars");
		options.addArguments("version");
		driver=new ChromeDriver(options);	
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		
		//send text using JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='facebook'",search); 
		js.executeScript("arguments[0].click()",search);//arguments[0].click()
		
	
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
			
	}

}
