package com.vtiger.assignmentorganizationsTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sdet34l1.genericlibrary.BaseClass;
import com.sdet34l1.genericlibrary.ExcelUtility;
import com.sdet34l1.genericlibrary.FileUtility;
import com.sdet34l1.genericlibrary.IconstantPath;
import com.sdet34l1.genericlibrary.JavaUtility;
import com.sdet34l1.genericlibrary.WebDriverUtility;
import com.vtiger.objectRepository.CreateNewOrganizationPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;
import com.vtiger.objectRepository.OrganizationInformationPage;
import com.vtiger.objectRepository.OrganizationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationsWithEmailOptOutSelectedOrNotTest extends BaseClass
{
	
	String organizationName;
	OrganizationInformationPage organizationinformationpage;
	OrganizationPage organizationpage;
	CreateNewOrganizationPage createneworganizationpage;
	
	@Test(groups="sanity")
	public void createOrganizationsWithEmailOptOutSelectedOrNot() throws IOException
	{
		organizationName = excelUtility.DataFromExcel("CreateContact",5,1)+randomnumber;
		organizationinformationpage= new OrganizationInformationPage(driver);
		organizationpage = new OrganizationPage(driver);
		createneworganizationpage = new CreateNewOrganizationPage(driver);
		
		homepage.clickOrganization();
		organizationpage.clickCreateOrganization(driver);
		createneworganizationpage.enterOrganizationName(organizationName);
		createneworganizationpage.clickCheckBox();
		createneworganizationpage.clickCheckBox();
		createneworganizationpage.clickCheckBox();
		jutil.printStatement("Email opt out checkbox is Enabled");
		createneworganizationpage.saveOrganization();
		jutil.printStatement(organizationinformationpage.getUpdatedTitle());
		jutil.printStatement(organizationinformationpage.getOrganizationName());
		jutil.assertionThroughIfCondition(organizationinformationpage.getOrganizationName(),organizationName,"Organization with Email opt out ");
	}	
}
	
	























/*
 * public static void main(String[] args) throws IOException, InterruptedException 
		{	
		FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		JavaUtility jutil = new JavaUtility();	
		String url = FileUtility.getDataFromPropertyFile("url");
		String username = FileUtility.getDataFromPropertyFile("username");
		String password = FileUtility.getDataFromPropertyFile("password");
		String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
		String browser = FileUtility.getDataFromPropertyFile("browser");
		
		int randomnumber = jutil.getRandomNumber(1000);
		String orgName = ExcelUtility.getDataFromExcel("CreateOrganization",1,2)+randomnumber;
		jutil.printStatement("Organization Name "+ orgName);
		
		
		long longtimeout = Long.parseLong(timeouts);
		WebDriver driver = null;
		
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
		
		WebDriverUtility.browserSetting(longtimeout, driver);
		WebDriverUtility.explicitlyWait(driver, longtimeout);
		WebDriverUtility.initializeActions(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		OrganizationInformationPage organizationinformationpage= new OrganizationInformationPage(driver);
		OrganizationPage organizationpage = new OrganizationPage(driver);
		CreateNewOrganizationPage createneworganizationpage = new CreateNewOrganizationPage(driver);
		
		
		WebDriverUtility.launchApp(url, driver);
		loginpage.loginAction(username, password);
		homepage.clickOrganization();
		organizationpage.clickCreateOrganization(driver);
		createneworganizationpage.enterOrganizationName(orgName);
		createneworganizationpage.clickCheckBox();
		createneworganizationpage.clickCheckBox();
		createneworganizationpage.clickCheckBox();
		jutil.printStatement("Email opt out checkbox is Enabled");
		createneworganizationpage.saveOrganization();
		jutil.printStatement(organizationinformationpage.getUpdatedTitle());
		jutil.printStatement(organizationinformationpage.getOrganizationName());
		jutil.assertionThroughIfCondition(organizationinformationpage.getOrganizationName(),orgName,"Organization with Email opt out ");
		homepage.signOut(driver);
		WebDriverUtility.quitBrowser(driver);
	}
}
 */






































/*
 * public static void main(String[] args) throws IOException, InterruptedException 
		{	
		FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		JavaUtility jutil = new JavaUtility();	
		String url = FileUtility.getDataFromPropertyFile("url");
		String username = FileUtility.getDataFromPropertyFile("username");
		String password = FileUtility.getDataFromPropertyFile("password");
		String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
		String browser = FileUtility.getDataFromPropertyFile("browser");
		
		int randomnumber = jutil.getRandomNumber(1000);
		String orgName = ExcelUtility.getDataFromExcel("CreateOrganization",1,2)+randomnumber;
		jutil.printStatement("Organization Name "+ orgName);
		
		
		long longtimeout = Long.parseLong(timeouts);
		WebDriver driver = null;
		
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
		
		WebDriverUtility.launchApp(url, driver);
		WebDriverUtility.browserSetting(longtimeout, driver);
		WebDriverUtility.explicitlyWait(driver, longtimeout);
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(orgName);
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		jutil.printStatement("Email opt out checkbox is Enabled");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		//String msg = driver.findElement(By.className("dvHeaderText")).getText();
		String msg1 = driver.findElement(By.xpath("//span[@class='dvHeaderText']/..")).getText();
		jutil.printStatement(msg1);
		
		
		WebDriverUtility.initializeActions(driver);
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		WebDriverUtility.mouseHoverOntheElement(logout, driver);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		WebDriverUtility.quitBrowser(driver);
		
		
		
	
	}
 */ 
