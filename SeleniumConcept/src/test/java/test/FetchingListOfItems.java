package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingListOfItems {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		dropdown.click();

		WebElement listValue = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='za']"));
		listValue.click();

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));

		for (WebElement element : ele) {
			System.out.println(element.getText());

		}

		driver.close();

	}

}
