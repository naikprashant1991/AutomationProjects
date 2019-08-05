package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com"); 
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		
		//starts-with
		//driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).sendKeys("Mobile");

		//ends-with
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("tablets");
	
		//For links: custom Xpath
		//Links are represented by <a> html tag
		
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
	}

}
