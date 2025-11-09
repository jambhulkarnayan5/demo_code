package test2;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void InitialiseBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = WebDriverManager.chromedriver().create();
			// driver=new ChromeDriver();
			break;
		case "firefox":
			driver = WebDriverManager.firefoxdriver().create();
			break;
		case "edge":
			driver = WebDriverManager.edgedriver().create();
			// driver=new EdgeDriver();

			break;

		default:
			System.err.println("BrowserName is invalid:");
			break;
		}

		driver.manage().window().maximize();

	}

//	@AfterTest
//	public void TearDown() {
//		driver.quit();
//	}

	
	@Test
	@Parameters("url")
	public void LaunchApp(String url) {
		driver.get(url);
		driver.getTitle();

	}

	@Parameters({ "username", "password" })
	@Test
	public void EnterLoginDetails(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		

	}

	@Test
	public void NavigateToMyInfo() {

		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		// span[normalize-space()='My Info']

	}

	@Test
	public void VerifyMyInfo() {

		boolean actualValue = driver.findElement(By.xpath("//h6[normalize-space()='Personal Details']")).isDisplayed();
		assertTrue(actualValue);
		

	}

}
