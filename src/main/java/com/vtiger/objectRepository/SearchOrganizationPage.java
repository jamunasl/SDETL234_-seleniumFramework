package com.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericlibrary.WebDriverUtility;

public class SearchOrganizationPage 
{
	@FindBy(id = "search_txt")
	private WebElement searchTxt;
	
	@FindBy(css = "[name='search']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//a[contains(@onclick,'set_return_address')]")
	private WebElement clickFirstOrganization;
	
	//initialize the driver address to all the elements through contructors and make it as public
	public SearchOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public void selectOrganization(String organizationName,WebDriver driver)
	{
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		webDriverUtility.switchToWindowBasedOnTitle(driver,"Organizations");
		searchTxt.sendKeys(organizationName);
		searchBtn.click();
		clickFirstOrganization.click();
		webDriverUtility.switchToWindowBasedOnTitle(driver, "Contacts");
	}
	
	public void selectMemberOfOrganization(String organizationName , WebDriver driver)
	{
		WebDriverUtility webDriverUtility = new WebDriverUtility();

		webDriverUtility.switchToWindowBasedOnTitle(driver, "Accounts&action");
	    searchTxt.sendKeys(organizationName);
	    searchBtn.click();
	    clickFirstOrganization.click();
	    webDriverUtility.switchToWindowBasedOnTitle(driver,"Organizations");
	}
	
	public void selectMemberOfOrganizationAndClear(String organizationName , WebDriver driver)
	{
		WebDriverUtility webDriverUtility = new WebDriverUtility();

		webDriverUtility.switchToWindowBasedOnTitle(driver, "Accounts&action");
	   searchTxt.sendKeys(organizationName);
	   searchTxt.clear();
	   clickFirstOrganization.click();
	   webDriverUtility.switchToWindowBasedOnTitle(driver,"Organizations");
	}
}
