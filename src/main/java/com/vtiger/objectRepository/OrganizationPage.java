package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createorganizationImg;
	
	
	//initialize the driver address to all the elements through contructors and make it as public
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		
		
	//Business library
	public void clickCreateOrganization(WebDriver driver)
	{
		createorganizationImg.click();
	}
}
