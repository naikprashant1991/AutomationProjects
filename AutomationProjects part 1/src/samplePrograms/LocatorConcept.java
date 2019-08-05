package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 
		
		//By Using Xpath
		/*
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Prashant");
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Naik");
		
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("9022884318");
		*/
		
		//By Using ID:
		driver.findElement(By.id("u_0_l")).sendKeys("Prashant");
		
		driver.findElement(By.id("u_0_n")).sendKeys("Naik");
		
		//By using LinkText
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//By using Partial Link Text
		
		//By using CSS Selector
		driver.findElement(By.cssSelector("#u_0_q")).sendKeys("9022884318");
		
	}

}
