package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		// Switch from main window to pop up window
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		if(alert.getText().equals("Please enter a valid user name"))
		{
			System.out.println("Alert message is correct");
		}else
		{
			System.out.println("Alert message is incorrect");
		}
		
		alert.accept(); // Click on OK button
		
		//alert.dismiss(); // Click on Cancel button
		

	}

}
