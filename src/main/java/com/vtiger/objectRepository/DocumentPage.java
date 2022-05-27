package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPage 
{
	@FindBy(css = "[title='Create Document...']")
	private WebElement clickDocumentImg;

	
	
	public DocumentPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public void clickCreateDocument()
	{
		clickDocumentImg.click();
	}
	
}