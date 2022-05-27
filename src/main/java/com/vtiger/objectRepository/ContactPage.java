package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	@FindBy(css = "[title='Create Contact...']")
	private WebElement createContactImg;
	
	
	//initialize the driver address to all the elements through contructors and make it as public
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		
		
	//Business library
	public void clickContactImg(WebDriver driver)
	{
		createContactImg.click();
	}
}
