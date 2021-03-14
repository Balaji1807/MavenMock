package org.fail.ex;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnotherTest {
	
	@Test(retryAnalyzer=org.fail.ex.AnotherExamplefail.class)
	public void test1()
	{
		Assert.assertEquals(false, true);
		System.out.println("this is test1");
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(false, false);
		System.out.println("this is test2");
		
	}

}
