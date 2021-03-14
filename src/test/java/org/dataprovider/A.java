package org.dataprovider;

import org.testng.annotations.Test;

public class A {
	
	@Test(dataProvider="SampleData",dataProviderClass=ExampleData.class)
	private void tc2(String s1,String s2) {
		System.out.println(s1 +"*******"+ s2);
	}

}
