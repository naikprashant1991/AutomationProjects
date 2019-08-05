package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite //1
	public void  setup() {
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass //3
	public void Login() {
		System.out.println("Login to App");
	}

	/*
	 Pair - 1
	 @BeforeMethod
	 @Test
	 @AfterMethod
	 
	 Pair - 2
	 @BeforeMethod
	 @Test
	 @AfterMethod
	 */
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("Enter URL");
	}

	
	@Test //5
	public void googleTitle() {
	System.out.println("Google Title Test");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Search Test");
	}
	
	@AfterMethod //6
	public void logout() {
		System.out.println("logout from app");
		
	}
	
	
	@AfterClass //7
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("Delete All cookies");
	}	

	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("Generate Test report");
	}
		
}
		


