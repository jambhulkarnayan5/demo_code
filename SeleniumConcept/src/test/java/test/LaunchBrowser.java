package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	




		public static void main(String[] args) throws InterruptedException 

		{

			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();

			driver.get("https://amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().fullscreen();
			
			Thread.sleep(10000);
			driver.manage().window().minimize();

			//driver.close();

			

		}



	}


