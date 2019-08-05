package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver); 
		
		//action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SpiceMax")).click();
		
		

	}

}
