package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage 
{
	@FindBy(xpath = "//span[@id='dtlview_Last Name']")
	private WebElement getNameText;
	
	
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Business library
	public String getContactName()
	{
		return getNameText.getText();
	}
}
