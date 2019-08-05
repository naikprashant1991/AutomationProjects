package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.className("btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left"));
		driver.findElement(By.name("email")).sendKeys("naik.prashant1991@yahoo.com");
		
		driver.findElement(By.name("password")).sendKeys("Crmuser@123"); 
		
		

	}

}
