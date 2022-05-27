package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPracticeTest extends TestNgBasicConfigTest
{
	@Test
	public void testPractice1Test()
	{
		Reporter.log("test 1",true);
	}
	
	@Test
	public void testPractice2Test()
	{
		Reporter.log("test 2",true);
	}
	
	@Test
	public void testPractice3Test()
	{
		Reporter.log("test 3",true);
	}
}
