package com.Test;

import org.testng.annotations.Test;

public class InvocationCountTest 
{

	@Test(invocationCount=5)
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of a and b is:"+c);
	}
}
