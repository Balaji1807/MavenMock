package org.fail.ex;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ManualFail implements IRetryAnalyzer {
	
	int counter=0;
	int testCaserun=4;

	public boolean retry(ITestResult result) 
	{
		if(counter < testCaserun)
		{
			counter++;
			return true;
		}
		return false;
	}
	
	

}
