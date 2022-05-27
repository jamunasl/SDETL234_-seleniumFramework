package com.sdet34l1.genericlibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is used to  store commonData for all test scripts
 * @author jamuna
 *
 */
public class BaseClass 
{
	public static WebDriver staticdriver ;
	public int randomnumber;
	public String password;
	public String username;
	public long longtimeout;
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public JavaUtility jutil;
	public WebDriverUtility webDriverUtility;
	public ExcelUtility excelUtility;
	public FileUtility fileUtility;
	
	
	/**
	 *@BeforeSuite is used write  common actions excelconnection ,databaseconnection ,PropertyFile connection
	 * @throws IOException
	 */
	@BeforeSuite(groups="baseclass")
	public void beforesuiteTest() throws IOException
	{
		System.out.println("hai iam beforeSuite");

		//open database if it is required
		//FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		//ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
	}
	/**
	 *@throws Throwable 
	 * @throws NumberFormatException 
	 * @throws EncryptedDocumentException 
	 * @Beforeclass is used to write normalexecution like launch browseer ,
	 *navigate application 
	 *read the commonData browser setting
	 *and we have to create instance of CommonPom class
	 *we have to create instance of explicit wait
	 */
	@Parameters( "browser")
	@BeforeClass(groups="baseclass")
	
	public void beforeclassTest(/*String browser*/) throws EncryptedDocumentException, NumberFormatException, Throwable
	{
		
        fileUtility= new FileUtility();
		excelUtility=new ExcelUtility();

	  fileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
       excelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		
		 webDriverUtility=new WebDriverUtility();
		
		jutil = new JavaUtility();
		String url = fileUtility.getDataFromPropertyFile("url");
		username = fileUtility.getDataFromPropertyFile("username");
		password = fileUtility.getDataFromPropertyFile("password");
		String timeouts = fileUtility.getDataFromPropertyFile("timeouts");
		String browser = fileUtility.getDataFromPropertyFile("browser");
		longtimeout = Long.parseLong(timeouts);
		randomnumber = jutil.getRandomNumber(1000);
		
		
		switch (browser)
		{
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	
		
		
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		staticdriver=driver;
		webDriverUtility.browserSetting(longtimeout, driver);
		webDriverUtility.explicitlyWait(driver, longtimeout);
		webDriverUtility= new WebDriverUtility();
		webDriverUtility.initializeActions(driver);
		
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		webDriverUtility.launchApp(url, driver);
	}
	/**
	 * This annotation is used to  write Login actions	
	 */
	
	@BeforeMethod(groups="baseclass")
	public void beforeMethodTest()
	{
		loginpage.loginAction(username, password);
	}
	/**
	 * this annotation is used to write logout actions
	 */
	@AfterMethod(groups="baseclass")
	public void afterMethodTest()
	{
		homepage.signOut(driver, webDriverUtility);
	}
	/**
	 * this annotation is used to write a close browser action
	 */
	
	@AfterClass(groups="baseclass")
	
	public void afterClassTest()
	{
		webDriverUtility.quitBrowser(driver);
	}
	/**
	 * this annotation is used to close the connection
	 * @throws IOException
	 */
	@AfterSuite(groups="baseclass")
	
	public void afterSuiteTest() throws IOException
	{
		excelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
		excelUtility.closeExcel();
	}
	
	
}
