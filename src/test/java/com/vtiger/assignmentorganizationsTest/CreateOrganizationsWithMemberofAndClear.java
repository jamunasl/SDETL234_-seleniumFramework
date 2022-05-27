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
import com.vtiger.objectRepository.SearchOrganizationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationsWithMemberofAndClear extends BaseClass

{
	OrganizationInformationPage organizationinformationpage;
	OrganizationPage organizationpage ;
	CreateNewOrganizationPage createneworganizationpage ;
	SearchOrganizationPage searchorganizationpage ;
	
	 @Test(groups={"sanity","regression"})
	 public void createWithMemberTest()
	 {
		 
	 
		
		String orgName = excelUtility.DataFromExcel("CreateOrganization",1,2)+randomnumber;
		jutil.printStatement(orgName);
		
		organizationinformationpage= new OrganizationInformationPage(driver);
		 organizationpage = new OrganizationPage(driver);
		 createneworganizationpage = new CreateNewOrganizationPage(driver);
		 searchorganizationpage = new SearchOrganizationPage(driver);
		 homepage.clickOrganization();
		 organizationpage.clickCreateOrganization(driver);
		 createneworganizationpage.enterOrganizationName(orgName);
		 createneworganizationpage.selectMemberOf();
		 searchorganizationpage.selectMemberOfOrganizationAndClear(orgName, driver);
		createneworganizationpage.saveOrganization();
		jutil.printStatement(organizationinformationpage.getOrganizationName());
		homepage.signOut(driver,webDriverUtility);
		
	 }
}
		
		 
		
				
		
	


























/*
 * 
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
		jutil.printStatement(orgName);
		
		
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
		
		//member of
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		WebDriverUtility.switchToWindowBasedOnTitle(driver, "Accounts&action");
		
		WebElement orgName1 = driver.findElement(By.xpath("//input[@id='search_txt']"));
		orgName1.sendKeys(orgName);
		Thread.sleep(2000);
		orgName1.clear();
		driver.findElement(By.xpath("//a[contains(@onclick,'set_return_address')]")).click();
		WebDriverUtility.switchToWindowBasedOnTitle(driver, "Organizations");
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		WebDriverUtility.initializeActions(driver);
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		WebDriverUtility.mouseHoverOntheElement(logout, driver);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		WebDriverUtility.quitBrowser(driver);
		
		
	}
*/