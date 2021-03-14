package org.fail.ex;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AnotherExamplefail implements IRetryAnalyzer {

	
	int counter=0;
	int repeat=4;
	
	public boolean retry(ITestResult result) {
		
		if(counter<repeat)
		{
			counter++;
			return true;
		}
		return false;
	}

}
