package org.testng.real1;

import org.testng.annotations.Test;

public class Example2 {
	
	@Test(groups="sanity")
	public void test11()
	{
		System.out.println("this is test11");
	}
	

	@Test(groups="regression")
	public void test12()
	{
		System.out.println("this is test12");
	}
	

	@Test(groups="smoke")
	public void test13()
	{
		System.out.println("this is test13");
	}
	


}
