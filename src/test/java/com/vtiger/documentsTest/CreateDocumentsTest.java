package com.vtiger.documentsTest;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
import com.vtiger.objectRepository.CreateNewDocumentPage;
import com.vtiger.objectRepository.DocumentInformationPage;
import com.vtiger.objectRepository.DocumentPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDocumentsTest extends BaseClass
{
	String documenttitle;
	String documentpath;
	String documentdescription;
	String documentfileName;
	
	DocumentPage documentpage;
	CreateNewDocumentPage createNewdocumentpage;
	DocumentInformationPage documentinformationpage;
	
	@Test(groups="sanity")
	public void createCampaignTest() throws IOException
	{
		String documenttitle = excelUtility.DataFromExcel("ProductTest", 8, 1)+randomnumber;
		String documentpath = excelUtility.DataFromExcel("ProductTest", 8, 2);
		String documentdescription = excelUtility.DataFromExcel("ProductTest", 8, 3);
		String documentfileName = excelUtility.DataFromExcel("ProductTest", 8, 4);
		
		documentpage = new DocumentPage(driver);
		createNewdocumentpage= new CreateNewDocumentPage(driver);
		documentinformationpage = new DocumentInformationPage(driver);
		
		homepage.clickDocument();
		documentpage.clickCreateDocument();
		createNewdocumentpage.createDocuments(documenttitle);
		createNewdocumentpage.enterDescription(driver, documentdescription);
		createNewdocumentpage.scrollTillElementPage(driver);
		createNewdocumentpage.fileInformationFill(driver, documentfileName, 1);
		createNewdocumentpage.documentSave();
		jutil.printStatement(documentinformationpage.getUpdatedTitle());
		jutil.printStatement("Document created Successfully");
		}
}
	
	
		
		





























