package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgAsseration   {
	
	@Test
	public void practice1Test()
	{  
		Reporter.log("a-Practice1",true);
		Reporter.log("b-Practice1",true);
		Reporter.log("c-Practice1",true);
		Reporter.log("d-Practice1",true);
        Assert.fail();
		Reporter.log("e-Practice1",true);
	
		
	}
	@Test
	public void practice2Test()
	{  
		Reporter.log("f-Practice2",true);
		Reporter.log("g-Practice2",true);
		Reporter.log("h-Practice2",true);
		Reporter.log("i-Practice2",true);
        Assert.fail();
		Reporter.log("j-Practice2",true);
	
		
	}
	@Test
	public void practic31Test()
	{  
		Reporter.log("k-Practice3",true);
		Reporter.log("l-Practice3",true);
		Reporter.log("m-Practice3",true);
		Reporter.log("n-Practice3",true);
        Assert.fail();
		Reporter.log("e-Practice3",true);
	
		
	}
	@Test
	public void practice4Test()
	{  
		Reporter.log("a-Practic4",true);
		Reporter.log("b-Practic4",true);
		Reporter.log("c-Practic4",true);
		Reporter.log("d-Practic4",true);
        Assert.fail();
		Reporter.log("e-Practic4",true);
	
		
	}


	

	

}
