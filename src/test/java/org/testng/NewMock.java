package org.testng;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

public class NewMock {
	
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("browser is launch");
	}
	
	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("browser is launch");
	}
	
	@Before
	public void start()
	{
		System.out.println("test is start");
		
	}
	@After
	public void close()
	{
		System.out.println("test is closed");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("t2");
	}
	

}
