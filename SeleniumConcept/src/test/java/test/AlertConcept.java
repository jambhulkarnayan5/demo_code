package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        
        //simple alert
//        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//        driver.findElement(By.id("alertBox")).click();
//        Alert simpleAlert = driver.switchTo().alert();
//        System.out.println(simpleAlert.getText());
//        Thread.sleep(2000);
//        simpleAlert.accept();
        
        
        
        
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("abcdefgh");
        Thread.sleep(2000);
        promptAlert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        
       driver.quit();
       
        
	}

}
