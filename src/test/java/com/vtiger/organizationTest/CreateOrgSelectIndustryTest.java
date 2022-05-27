package com.vtiger.organizationTest;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sdet34l1.genericlibrary.BaseClass;
import com.sdet34l1.genericlibrary.ExcelUtility;
import com.sdet34l1.genericlibrary.FileUtility;
import com.sdet34l1.genericlibrary.IconstantPath;
import com.sdet34l1.genericlibrary.JavaUtility;
import com.sdet34l1.genericlibrary.WebDriverUtility;
import com.vtiger.objectRepository.CreateNewOrganizationPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;
import com.vtiger.objectRepository.OrganizationInformationPage;
import com.vtiger.objectRepository.OrganizationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgSelectIndustryTest extends BaseClass
{
	String organizationName;
	String visibletextindustry ;
	String visibletexttype;
	OrganizationInformationPage organizationinformationpage;
	OrganizationPage organizationpage;
	CreateNewOrganizationPage createneworganizationpage;
	
	@Test(groups={"sanity","regression"})
	public void createOrganizationTest() throws IOException
	{
		visibletextindustry = fileUtility.getDataFromPropertyFile("industry");
		visibletexttype = fileUtility.getDataFromPropertyFile("type");
		organizationName = excelUtility.DataFromExcel("CreateContact",5,1)+randomnumber;
		organizationinformationpage= new OrganizationInformationPage(driver);
		organizationpage = new OrganizationPage(driver);
		createneworganizationpage = new CreateNewOrganizationPage(driver);
		
		homepage.clickOrganization();
		organizationpage.clickCreateOrganization(driver);
		createneworganizationpage.enterOrganizationName(organizationName);
		createneworganizationpage.selectIndustry(driver, visibletextindustry);
		createneworganizationpage.selectType(driver, visibletexttype);
		createneworganizationpage.saveOrganization();
		jutil.assertionThroughIfCondition(organizationinformationpage.getOrganizationName(),organizationName,"Organization with select industry and type ");
	}
}





























