package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new HtmlUnitDriver();
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
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		
		/*
		 //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		*/
 
		String Before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String After_xpath = "]/td[2]";
		
		for(int i=1;i<=3;i++) {
			String Name = driver.findElement(By.xpath(Before_xpath+i+ After_xpath)).getText();
			System.out.println(Name);
		}
	}

}
