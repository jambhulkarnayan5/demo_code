package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class JavascriptExecuterConcept {
		public static void main(String args[]) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
		
			// Instantiate a Driver class.
			WebDriver driver = new ChromeDriver();
		
			// Maximize the browser
			driver.manage().window().maximize();

		
		
			
			driver.get("https://www.google.com/");
			
			WebElement search = driver.findElement(By.id("APjFqb"));
			
			//send text using JavascriptExecutor
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='facebook'",search); 
			js.executeScript("arguments[0].click();",search);//arguments[0].click()
			
			Thread.sleep(5000);
			// move page vertically
			js.executeScript("window.scrollBy(0,600)");
			
			////send text using actions class
			//WebElement ele = driver.findElement(By.id("APjFqb"));
		 // Actions act = new Actions(driver);
//		  act.sendKeys(ele,"abced").build().perform();
		  
			
			
			
			
			//String sText =  js.executeScript(“return document.title;”).toString();
			
			// js.executeScript(“window.scrollBy(0,150)”);
			
			

			
		}

		
	}


