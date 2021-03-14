package org.testng.real;

import org.testng.annotations.Test;

public class Example2 {
	@Test(priority=11)
	public void test11()
	{
		System.out.println("test11");
	}
	@Test(priority=0)
	public void test12()
	{
		System.out.println("test12");
	}

	@Test(priority=-1)
	public void test13()
	{
		System.out.println("test13");
	}

}
