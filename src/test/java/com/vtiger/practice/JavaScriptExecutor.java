package com.vtiger.practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet34l1.genericlibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor 
{
	public static void main(String[] args) throws IOException {
		
		WebDriverUtility webDriverUtility= new  WebDriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		webDriverUtility.initializeJs(driver);
		webDriverUtility.launchApplicationThroughJs("http://localhost:8888");
		//jse.executeScript("window.location='http://localhost:8888'");
		//jse
		driver.manage().window().maximize();
		webDriverUtility.enterDataThroughJs(driver.findElement(By.name("user_name")),"admin");
		webDriverUtility.enterDataThroughJs(driver.findElement(By.name("user_password")),"root");
		webDriverUtility.clickThroughJs(driver.findElement(By.id("submitButton")));
		webDriverUtility.scrollTillElementThroughJs(driver.findElement(By.xpath("//b[contains(.,'Top Trouble Tickets')]")));
		String fileName = new JavaScriptExecutor().getClass().getName();
		//WebDriverUtility.takeScreenShot(fileName, driver);
		
	}
}
