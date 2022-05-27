package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage 
{
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']")
	private WebElement getNameText;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']/..")
	private WebElement getUpdatedText;
	
	public OrganizationInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public String getOrganizationName()
	{
		return getNameText.getText();
	}
	
	public String getUpdatedTitle()
	{
		return getUpdatedText.getText();
	}
	 
}
