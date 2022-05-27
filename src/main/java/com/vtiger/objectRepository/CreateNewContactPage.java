package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
	@FindBy(css = "[name='lastname']")
	private WebElement contactLastNameTxt;
	
	@FindBy(css = "input.crmButton.small.save") 
	private WebElement saveBtn;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement addContactImg;
	
	
	//initialize the driver address to all the elements through contructors and make it as public
	public CreateNewContactPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public void contactCreateandSave(String contactName)
	{
		contactLastNameTxt.sendKeys(contactName);
		saveBtn.click();
	}
	
	public void enterContactNameAndSwitchtoSearchOrganization(String contactName)
	{
		contactLastNameTxt.sendKeys(contactName);
		addContactImg.click();
	}
	
	public void saveContact()
	{
		saveBtn.click();
	}
}
