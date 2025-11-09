package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("expression")).click();  // for dropdown
        List<WebElement> ele = driver.findElements(By.xpath("expression")); // for getting list of options
        for(WebElement element :ele) {
        	if(element.getText().equalsIgnoreCase("10")) {
        		element.click();
        	}
        }
       //other method 
        
        List<WebElement> values = driver.findElements(By.xpath("expression"));
        for(int i=0;i<values.size();i++) {
        	{	
        	if(values.get(i).getText().contains("java"))
        	values.get(i).click();
        	break;
        }
        
        }

}

}