package com.vtiger.objectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericlibrary.WebDriverUtility;

public class CreateNewDocumentPage 
{
	@FindBy (css = "[name='notes_title']")
	private WebElement documentTitleTxt;
	
	@FindBy(css = "[class='cke_show_borders']")
	private WebElement descriptionTxt;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	@FindBy(css = "[name='filelocationtype']")
	private WebElement downloadTypeDropDown;
	
	@FindBy(css = "[name='filename']")
	private WebElement fileNameTxt;
	
	
	@FindBy(css = "[title='Create Document...']")
	private WebElement scrollTillElement;
	
	public CreateNewDocumentPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Business library
	public void createDocuments(String title)
	{
		documentTitleTxt.sendKeys(title);
	}
	
	public void enterDescription(WebDriver driver, String documentdescription)
	{
		
		WebDriverUtility  webdriverutility= new WebDriverUtility();
		webdriverutility.explicitlyWait(driver, 10);
		webdriverutility.switchToFrame(driver, 0);
		descriptionTxt.sendKeys(documentdescription);
		webdriverutility.initializeActions(driver);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("b").perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("i").perform();
		act.keyUp(Keys.CONTROL).perform();
		webdriverutility.switchBackToHomeWebPage(driver);
	}
	
	public void scrollTillElementPage(WebDriver driver)
	{
		Robot r1 = null;
		try {
			r1 = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	
	public void fileInformationFill(WebDriver driver , String documentpath, int index)
	{
		WebDriverUtility  webdriverutility= new WebDriverUtility();

		webdriverutility.selectDropDown(downloadTypeDropDown,index );
		fileNameTxt.sendKeys(documentpath);
	}
	
	public void documentSave()
	{
		saveBtn.click();
	}
	
	
	
}
