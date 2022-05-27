package com.vtiger.practice;


import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.sdet34l1.genericlibrary.FileUtility;
import com.sdet34l1.genericlibrary.IconstantPath;
import com.sdet34l1.genericlibrary.JavaUtility;
import com.sdet34l1.genericlibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDataProperties 
{
		public static void main(String[] args) throws IOException 
		{	
			WebDriver driver = null;
			WebDriverManager.chromedriver().setup();
			JavaUtility jutil = new JavaUtility();
			WebDriverUtility webDriverUtility= new WebDriverUtility();
			FileUtility fileUtility = new FileUtility();

			fileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			String url = fileUtility.getDataFromPropertyFile("url");
			String username = fileUtility.getDataFromPropertyFile("username");
			String password = fileUtility.getDataFromPropertyFile("password");
			String timeouts = fileUtility.getDataFromPropertyFile("timeouts");
			String browser = fileUtility.getDataFromPropertyFile("browser");
			
			System.out.println("The URL is :"+url);
			System.out.println("The Username is :"+username);
			System.out.println("The password is :"+password);
			
			long longtimeout = Long.parseLong(timeouts);
			
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
			
		webDriverUtility.launchApp(url, driver);
		webDriverUtility.browserSetting(longtimeout, driver);
		webDriverUtility.explicitlyWait(driver, longtimeout);
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		String orgName = "gtiger";
		
		driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
	
		if(org.equalsIgnoreCase(orgName)) 
		{
			jutil.printStatement("Organization Created Successfully");
		}
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		webDriverUtility.mouseHoverOntheElement(logout, webDriverUtility);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		webDriverUtility.quitBrowser(driver);
	}
}



//Workbook book=workbookfactory.create(path);
//Sheet s=book.getsheet(sheet1);
//Row r=s.getrow(row num);
//Cell c=r.getcell();
 