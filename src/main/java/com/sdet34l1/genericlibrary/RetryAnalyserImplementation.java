package com.sdet34l1.genericlibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class RetryAnalyserImplementation implements  IRetryAnalyzer{

	
	int count=0;
	int maxRetry=3;
	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		if(count<=maxRetry)
		{
			count++;
			return true;
		}
		return false;
	}
}
	
	
