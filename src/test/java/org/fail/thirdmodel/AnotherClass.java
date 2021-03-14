package org.fail.thirdmodel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnotherClass {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, false);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false, false);
	}

}
