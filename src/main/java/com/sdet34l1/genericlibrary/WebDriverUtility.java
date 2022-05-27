package com.sdet34l1.genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

	
	/**
	 * This class is used to maintain all WebDriver common actions 
	 * @author jamuna
	 */
public class WebDriverUtility 

{
	public WebDriverWait wait; 
	 public  Actions act;
	 Select select;
     JavascriptExecutor jse;
	 JavaUtility jutil = new JavaUtility();
	


	/**
	 *This method is used to initialize the Actions class 
	 * @param driver
	 */
	public  void initializeActions(WebDriver driver)
	{   
		act = new Actions(driver);
	}
	
	
	public  void initializeSelect(WebElement element)
	{
		select= new Select(element);
	}
	
	/**
	 * This method is used to launch to the Application
	 * @param url
	 * @param driver
	 */
	public  void launchApp(String url , WebDriver driver)
	{
		driver.get(url);
	}
	
	/**
	 * This method is used to maximize the browser and implicitly wait also
	 * @param longTimeOut
	 * @param driver
	 */
	public  void browserSetting(long longTimeOut,WebDriver driver)
	{
		maximizeBrowser(driver);
		waitTillpageLoad(longTimeOut,driver);
	}
	
	/**
	 * This method is used to maximize the browser
	 * @param driver
	 */
	public  void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to implicitly wait till page load
	 * @param longTimeOut
	 * @param driver
	 */
	public void waitTillpageLoad(long longTimeOut,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);
	}
		
	/**
	 * This method is used to mouse hover on the element
	 * @param moreLink
	 * @param driver
	 */
	public  void mouseHoverOntheElement(WebElement element,WebDriverUtility webDriverUtility)
	{ 
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to double Click Actions On the element
	 * @param moreLink
	 */
	public  void doubleClickOnElement(WebElement element)
	{
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method is used to double click Actions on the webpage
	 */
	public  void doubleClick()
	{   
		act.doubleClick().perform();
	}
	
	/**
	 * This method is used to Right click Actions on the webpage
	 */
	public  void rightClick()
	{
		
		act.contextClick().perform();
	}
	
	/**
	 * This method is used to Right click Actions by element
	 * @param element
	 */
	public  void rightClick(WebElement element)
	{
		act.contextClick(element).perform();
	}
	
	/**
	 * This method is used to close the browser instance
	 * @param driver
	 */
	public  void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	/**
	 * This method is used to
	 * @param element
	 */
	public  void waitUntilElementClickable(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method is used to wait the control till the particular element is visible
	 * @param element
	 * @param timeOut
	 * @param driver
	 */
	public  void WaitUntilElementVisible(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to initialize wait instance
	 * @param driver
	 * @param timeOut
	 */
	public  void explicitlyWait(WebDriver driver, long timeOut)
	{
		wait=new WebDriverWait(driver,timeOut);
	}
	
	/**
	 * This method is used to switch the window based on title
	 * @param driver
	 * @param partialText
	 */
	public  void switchToWindowBasedOnTitle(WebDriver driver,String partialText)
	{
		Set<String> sessionIDs = driver.getWindowHandles();
		for(String id:sessionIDs)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(partialText))
			{
				break;
			}
		}
	}
	
	/**
	 * This method is used to handle dropdown by value
	 * @param element
	 * @param value
	 */
	public void selectDropDown(WebElement element,String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	
	/**
	 * This method is used to handle dropdown by index
	 * @param element
	 * @param index
	 */
	public  void selectDropDown(WebElement element,int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is used to handle dropdown by visibleText
	 * @param visibleText
	 * @param element
	 */
	public void selectDropDown(String visibleText,WebElement element)
	{
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	/**
	 * This method is used to switch the frame by Index
	 * @param driver
	 * @param index
	 */
	public  void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch the frame by Name Or Id
	 * @param driver
	 * @param nameOrId
	 */
	public  void switchToFrame(WebDriver driver,String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method is used to switch the frame by Element
	 * @param driver
	 * @param element
	 */
	public  void switchToFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to back to Default WebPage 
	 * @param driver
	 */
	public  void switchBackToHomeWebPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to initialize the javascript
	 * @param driver
	 */
	public  void initializeJs(WebDriver driver)
	{
		jse=(JavascriptExecutor)driver;
	}
	
	/**h
	 * This method is used to enter the data through java script
	 * @param driver
	 * @param element
	 * @param data
	 */
	public  void enterDataThroughJs(WebElement element,String data)
	{
		jse.executeScript("arguments[0].value=arguments[1]",element,data);
	}
	
	/**
	 * This method is used to launch application through java script
	 * @param driver
	 * @param url
	 */
	public  void launchApplicationThroughJs(String url)
	{
		jse.executeScript("window.location=arguments[0]",url);
	}
	
	/**
	 * This method is used to scroll the webPage through java script by given number of height
	 * @param height
	 */
	public  void scrollToSpecifiedHeightThroughJs(String height)
	{
		jse.executeScript("window.scrollBy(0,"+height+")");
	}
	
	
	public  void clickThroughJs(WebElement element)
	{
		jse.executeScript("arguments[0].click()", element);
	}
	
	/**
	 * This method is used to scroll to bottom on the webPage through java script 
	 */
	public  void scrollToBottomThroughJs()
	{
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	/**
	 * This method is used to scroll the webPage through java script by element
	 * @param element
	 */
	public  void scrollTillElementThroughJs(WebElement element)
	{
		jse.executeScript("arguments[0].scrollIntoView()",element);
	}
	
	/**
	 * This method is used to handle alert popup accept
	 * @param driver
	 */
	public  void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to handle alert popup dismiss
	 * @param driver
	 */
	public  void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used to handle alert popup send data
	 * @param driver
	 * @param data
	 */
	public  void alertSendData(WebDriver driver,String data)
	{
		driver.switchTo().alert().sendKeys(data);
	}
	
	/**
	 * This method is used to handle alert popup getText
	 * @param driver
	 * @return
	 */
	public  String getalertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	/**
	 * This method is used to take a screenshot and filesave with data and time 
	 * @param fileName
	 * @param driver
	 * @return 
	 * @throws IOException
	 */
	public  String takeScreenShot(String fileName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+fileName+"_"+jutil.getDateTimeInFormat()+".png");
		FileUtils.copyFile(src, dst);
		 return dst.getAbsolutePath();

		//Files.copy(src,dst);
	}
}

