package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementFunctions {

	public static void main(String[] args) throws InterruptedException {
		//https://www.facebook.com/r.php?locale=en_GB
			
			WebDriverManager.firefoxdriver().setup();
		 	WebDriver driver = new FirefoxDriver();
		 	driver.manage().window().maximize();
		 	driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
		 	boolean display = driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
		 	
		 	if(display=true) {
		 		
		 		System.out.println("Logo is displayed");
		 	}
		 	else {
		 		System.out.println("Logo is not displayed");
		 	}
		 	
		 	boolean enable = driver.findElement(By.xpath("//a[@class='_9bq5']")).isEnabled();
		 	
            if(display=true) {
		 		
		 		System.out.println("Link is available");
		 	}
		 	else {
		 		System.out.println("Link is not available");
		 	}
            
            Thread.sleep(5000);
            
           WebElement selectedValue = driver.findElement(By.xpath("//input[@value='2']"));
           selectedValue .click();
            
             boolean selected = selectedValue.isSelected();
            
           if(selected=true) {
		 		
		 		System.out.println("Radiobutton is selected");
		 	}
		 	else {
		 		System.out.println("Radiobutton is not selected");
		 	}
            
		 	
		 	
		
	}

}
