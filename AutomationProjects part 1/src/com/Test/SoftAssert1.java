package com.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;


public class SoftAssert1 {
	
	SoftAssert softAssert = new SoftAssert();
	

	@Test
	public void Test() {
		SoftAssert softAssert1 = new SoftAssert();
		
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Click on Sign on button");
		Assert.assertEquals(true, true);
		
		System.out.println("validate Home page");
		softAssert1.assertEquals(true, false, "Home page title is missing");
		
		System.out.println("Go to deals page");
		System.out.println("Create a deal");
		softAssert1.assertEquals(true, false, "Not able to create a deal");
		
		softAssert1.assertAll();
		
	}
	
	@Test
	public void Test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(true, false,"logout failed");
		softAssert2.assertAll();
		
	}
}
