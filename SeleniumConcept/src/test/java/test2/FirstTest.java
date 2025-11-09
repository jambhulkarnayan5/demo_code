package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	WebDriver driver;
	@Test
	public void TestGoogle() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//		  driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		//driver=new FirefoxDriver();

	  
	WebDriverManager.chromedriver().setup();
	WebDriver  driver = new ChromeDriver();
	
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.id("APjFqb"));
	
		
		Thread.sleep(5000);
	//	driver.manage().window().minimize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='facebook',arguments[0].click()",search);
		driver.getTitle();
		//driver.quit();
	
	}
	
	@Test
	public void Flipkart() {
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//
//	    driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		
		driver.quit();
	}


}
