package com.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sdet34l1.genericlibrary.WebDriverUtility;

public class CreateNewOrganizationPage 
{
	@FindBy(css = "[name='accountname']")
	private WebElement organizationNameTxt;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@name='emailoptout']")
	private WebElement clickCheckBox;
	
	@FindBy(xpath = "//img[@title='Select'][1]")
	private WebElement selectMemberOfImg;
	
	@FindBy(css = "[name='industry']")
	private WebElement industryDropDown;
	
	@FindBy(css = "[name='accounttype']")
	private WebElement typeDropDown;
	
	@FindBy(css = "[value='T']")
	private WebElement clickGroupRadioBtn;
	
	@FindBy(css = "[value='U']")
	private WebElement clickUserRadioBtn;
	
	@FindBy(css = "[name='assigned_user_id']")
	private WebElement UserListDropDown;
	
	//@FindBy(xpath = "//option[text()=' Administrator']")
	//private WebElement SelectAdministratorList;
	
	
	//initialize the driver address to all the elements through contructors and make it as public
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Business library
	public void organizationCreateandSave(String organizationName)
	{
		organizationNameTxt.sendKeys(organizationName);
		saveBtn.click();
	}
	
	public void enterOrganizationName(String organizationName)
	{
		organizationNameTxt.sendKeys(organizationName);
	}
	
	public void selectIndustry(WebDriver driver ,  String visibleText)
	{
		WebDriverUtility  webDriverutility= new WebDriverUtility();

		webDriverutility.selectDropDown(visibleText, industryDropDown);
	}
	
	public void selectType(WebDriver driver,String visibleText)
	{
		WebDriverUtility  webDriverutility= new WebDriverUtility();

		webDriverutility.selectDropDown(visibleText, typeDropDown);
	}
	
	public void clickCheckBox()
	{
		clickCheckBox.click();
	}
	
	public void selectMemberOf()
	{
		selectMemberOfImg.click();
	}
	
	public void selectUser()
	{
		clickUserRadioBtn.click();
	}
	
	public void selectGroup()
	{
		clickGroupRadioBtn.click();
	}

	public void saveOrganization()
	{
		saveBtn.click();
	}
	
	public void selectUserDropDown(WebDriver driver, int index)
	{
		WebDriverUtility  webDriverutility= new WebDriverUtility();

		webDriverutility.selectDropDown(UserListDropDown, index);
	}
}
