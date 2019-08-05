package samplePrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 Different kind of pop ups:
		1. alerts - Javascript pop up - Alert API(accept,dismiss)
		2. File Upload pop up(Type=file,sendkeys(path))
		3. Browser window pop up(WindowHandler API - getWindowHandles())
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindowID = it.next();
		
		System.out.println("Parent window id is: "+ParentWindowID);
		
		String ChildWindowID = it.next();
		
		System.out.println("child window id is: "+ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		
		Thread.sleep(2000);
		
		System.out.println("Child window title is: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowID);
		
		Thread.sleep(2000);
		
		System.out.println("Parent window title is: "+driver.getTitle());
		
	}

}
