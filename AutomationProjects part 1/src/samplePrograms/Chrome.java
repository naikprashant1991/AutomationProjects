package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome 
{

	public static void main(String[] args) 
	{
		
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		String ExpectedTitle = "Facebook – log in or sign up";
		if(title.equals(ExpectedTitle))
		{ 
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
	
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
	}
	


}
