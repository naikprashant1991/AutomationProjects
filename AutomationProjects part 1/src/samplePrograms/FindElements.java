package samplePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElements {

	public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com"); 
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//1. Get the total number of link elements present on the page
		//2. Get the text of each link on the page
		
		List <WebElement> LinkList = driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i=0;i<LinkList.size();i++)
		{
		String linkText =LinkList.get(i).getText();
		System.out.println(linkText);
		}
		
	}

}
