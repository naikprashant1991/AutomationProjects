package com.Test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest() {
		System.out.println("Login test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest() {
		System.out.println("Search page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registrationTest() {
		System.out.println("Registration Test");
	}
}
	