package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com"); 
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		System.out.println("Before login: title of the page is:" +driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'https://ui.freecrm.com')]")).click();
		
		driver.findElement(By.name("email")).sendKeys("naik.prashant1991@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Crmuser@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(2000);
	
		System.out.println("After login: title of the page is:" +driver.getTitle());
		

	}

}
