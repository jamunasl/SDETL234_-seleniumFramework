package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

public class CreateCampaignWithProduct 
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
		
		FileInputStream fis1 = new FileInputStream("./src/test/resources/VtigerCreateOrg.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet s=book.getSheet("ProductTest");
		//pro
		Row r=s.getRow(5);
		Cell c=r.getCell(2);
		int randomnumber = jutil.getRandomNumber(1000);
		String pn = c.getStringCellValue()+randomnumber;
		System.out.println(pn);
		
		//cam
		Row r1=s.getRow(5);
		Cell c1=r1.getCell(1);
		String ls1 = c1.getStringCellValue()+randomnumber;
		System.out.println(ls1);
		book.close();
		
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
		WebDriverUtility webdriverUtility= new WebDriverUtility();
		webdriverUtility.explicitlyWait(driver, longtimeout);
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//create product
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.cssSelector("[name='productname']")).sendKeys(pn);
		driver.findElement(By.cssSelector("[value='  Save  ']")).click();		
		String proName = driver.findElement(By.id("mouseArea_Product Name")).getText();
		proName=proName.trim();
		
		//create campaign
		WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
		webdriverUtility.mouseHoverOntheElement(more, webdriverUtility);
		
		driver.findElement(By.cssSelector("[name='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.cssSelector("[name='campaignname']")).sendKeys(ls1);
		driver.findElement(By.cssSelector("[title='Select']")).click();
		
		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		
		for(String id:allid)
		{
			if(!id.equals(mainid))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.id("search_txt")).sendKeys(ls1);
		driver.findElement(By.cssSelector("[name='search']")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'set_return_specific')]")).click();
		
		driver.switchTo().window(mainid);
		
		driver.findElement(By.cssSelector("[class='crmButton small save']")).click();
		String camName = driver.findElement(By.id("mouseArea_Campaign Name")).getText();
		camName=camName.trim();
		
		if(proName.equals(pn) && camName.equals(ls1))
		{
			jutil.printStatement("Created Successfully");
		}
		else
		{
			jutil.printStatement("Not Created");
		}
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		webdriverUtility.mouseHoverOntheElement(logout, webdriverUtility);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		webDriverUtility.quitBrowser(driver);
	}
}

