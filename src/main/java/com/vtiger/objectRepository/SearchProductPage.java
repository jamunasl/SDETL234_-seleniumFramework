package com.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericlibrary.WebDriverUtility;

public class SearchProductPage
{
	@FindBy(id = "search_txt")
	private WebElement searchTxt;
	
	@FindBy(css = "[name='search']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//a[contains(@onclick,'set_return_specific')]")
	private WebElement selectFirstProduct;
	
	//initialize the driver address to all the elements through contructors and make it as public
	public SearchProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public void selectProduct(String productName,WebDriver driver)
	{
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		webDriverUtility.switchToWindowBasedOnTitle(driver,"Products");
		searchTxt.sendKeys(productName);
		searchBtn.click();
		selectFirstProduct.click();
		webDriverUtility.switchToWindowBasedOnTitle(driver, "Campaign");
	}
}
