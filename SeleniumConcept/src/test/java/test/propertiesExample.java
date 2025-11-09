package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertiesExample {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\My Tool\\Eclipse\\Eclipse workspace\\MavenProject\\src\\test\\resources\\properties\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String mybrowser = prop.getProperty("browser");
		String myurl = prop.getProperty("url");
		System.out.println(mybrowser);

		if (mybrowser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(myurl);
			driver.manage().window().maximize();
			driver.getTitle();

			driver.quit();
		}

		else if (mybrowser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(myurl);
			driver.manage().window().maximize();
			driver.getTitle();

			driver.quit();
		}

		else if (mybrowser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(myurl);
			driver.manage().window().maximize();
			driver.getTitle();

			driver.quit();
		}
	}
}
