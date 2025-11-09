package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDropDownValues {
	
	
	public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		Dimension d = new Dimension(400,500);
//		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement (By.xpath("//*[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone");
		
		List<WebElement> suggList= driver.findElements(By.xpath("//div[contains(@class,'YGcVZO _2VHNef')]"));
		
		for(WebElement e : suggList) {
			System.out.println(e.getText());
	        }
		
		System.out.println(driver.getTitle());
		driver.quit();
	

}
}
