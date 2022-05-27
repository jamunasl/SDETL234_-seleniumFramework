package com.vtiger.campaignTest;


import java.io.IOException;
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
import com.vtiger.objectRepository.CampaignInformationPage;
import com.vtiger.objectRepository.CampaignPage;
import com.vtiger.objectRepository.ContactInformationPage;
import com.vtiger.objectRepository.ContactPage;
import com.vtiger.objectRepository.CreateNewCampaignPage;
import com.vtiger.objectRepository.CreateNewContactPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignTest extends BaseClass
{
	String campaignname;
	CampaignPage campaignpame;
	CreateNewCampaignPage createnewcampaignpage;
	CampaignInformationPage campaigninformationpage;
	
	@Test(groups="sanity")
	public void createCampaignTest() throws IOException
	{
		campaignname = excelUtility.DataFromExcel("ProductTest",5,1)+randomnumber;
		campaignpame = new CampaignPage(driver);
		createnewcampaignpage = new CreateNewCampaignPage(driver);
		campaigninformationpage = new CampaignInformationPage(driver);
		
		homepage.clickCampaign(driver,webDriverUtility);
		campaignpame.clickCampaignImg(driver);
		createnewcampaignpage.campaignCreateandSave(campaignname);
		jutil.assertionThroughIfCondition(campaigninformationpage.getCampaignName(), campaignname, "Campaign ");
		}
}


























