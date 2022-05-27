package com.sdet34l1.genericlibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.objectRepository.CampaignInformationPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;

public class ListernersImplentation  implements ITestListener{
	
	/*public int randomnumber;
	public  static String password;
	public static  String username;
	public long longtimeout;
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public JavaUtility jutil;
	public WebDriverUtility webdriverutility;
	public FileUtility  fileUtility;
	public String browser;
	public String url;
	public long longTimeOut;
	public CampaignInformationPage campaignInformationPage;*/
	ExtentReports report;
	ExtentTest  test;
	
	@Override
	public void onStart(ITestContext result) {
		System.out.println("onStart");
		ExtentSparkReporter spark = new ExtentSparkReporter("./extentReport/extentreport.html");
		spark.config().setDocumentTitle("Documenttitle");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("ReporterName");
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Enviornment", "Testing Enviornment");
		report.setSystemInfo("Reporter Name", "JAMUNA S L");
		report.setSystemInfo("Platform", "windows 10");
		report.setSystemInfo("unit testing tool", "TESTNG");
		report.setSystemInfo("Build management Tool", "Maven");
		report.setSystemInfo("Automation Tool", "Selenium");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
		test=report.createTest(result.getMethod().getMethodName());
		
	}
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestSkipped");
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		JavaUtility javaUtility = new JavaUtility();
		try {
			test.addScreenCaptureFromPath(webDriverUtility.takeScreenShot(result.getMethod().getMethodName(),BaseClass.staticdriver));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		test.log(Status.PASS, result.getMethod().getMethodName());
		
	}
	@Override
	public void onFinish(ITestContext result) {
		System.out.println("onFinish");
		report.flush();
	}


}
