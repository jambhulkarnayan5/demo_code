    package testcases;

	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import pages.DashBoardPage;
	import pages.LoginPage;



	public class BaseTest {
		static WebDriver driver;
		LoginPage lp;
		DashBoardPage db;
		@BeforeSuite
		public void initBrowser() {
//			System.setProperty("webdriver.chrome.driver",
//					"path");
			
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
		}
		
		@BeforeClass
		public void createObject() throws IOException
		{
			 lp = new LoginPage(driver);
			 db = new DashBoardPage(driver);
			 
		}
		
		

	}



