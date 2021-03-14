package org.testng.real;

import org.testng.annotations.Test;

public class Example3 {
	@Test(priority=10)
	public void test21()
	{
		System.out.println("test21");
	}
	@Test(priority=9)
	public void test22()
	{
		System.out.println("test22");
	}

	@Test(priority=8)
	public void test23()
	{
		System.out.println("test23");
	}

}
