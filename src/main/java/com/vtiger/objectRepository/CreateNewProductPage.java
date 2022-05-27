package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage 
{
	@FindBy(css = "[name='productname']")
	private WebElement productNameTxt;
	
	@FindBy(css = "[value='  Save  ']")
	private WebElement saveBtn;
	
	
	//initialize the driver address to all the elements through contructors and make it as public
	public CreateNewProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void productCreateandSave(String productName)
	{
		productNameTxt.sendKeys(productName);
		saveBtn.click();
	}
}
