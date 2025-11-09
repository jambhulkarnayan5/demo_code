package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MulptipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

//	driver.findElement(By.xpath("//button[@aria-label='Confirmation. Get your favourite food at your train seat through <a class=\"txt-msg-info\" target=\"_blank\" href=\"https://www.ecatering.irctc.co.in/\">e-Catering</a> available at selected stations.<br/><br/>COVID 19 Alert:<br/><br/><i class=\"fa fa-circle\" ></i> All passengers are advised to wear face covers/masks at the entry/exit and during travel.<br/><br/><i class=\"fa fa-circle\" ></i> All passengers are advised that on arrival at their destination, the travelling passenger shall follow the Covid protocol/guidelines issued by Ministry of Home affairs, Ministry of Health and Family Welfare and concerned State/UTs on the subject from time to time.<br/><br/><i class=\"fa fa-circle\" ></i><a class=\"txt-msg-info\"target=\"_blank\"href=\"http://contents.irctc.co.in/en/CovidVaccinationInfoEng.pdf\"> Information on Covid 19 Vaccination Programme</a>. Press OK to confirm']")).click();
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		//List<String> handles = new ArrayList<String> ( driver.getWindowHandles()); // parentid,childid,subchildid
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentid =  it.next();
		String childid =  it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ABCDEFGH");
		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Switched on Parent window");
		
		
		
		

		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//span[normalize-space()='Flight']")).click();

		System.out.println("Parent Window " + parentid);
		System.out.println("Chiled Window " + childid);

		// driver.switchTo().window(parentid);

	}

}
