package samplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
	
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Automation Projects\\AutomationProjects part 1\\src\\samplePrograms\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("Name"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String BrowserName = prop.getProperty("Browser");
		
		System.out.println(BrowserName);
		
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("Email_Xpath"))).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.xpath(prop.getProperty("Password_Xpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Login_btn_Xpath"))).click();
	}

}
