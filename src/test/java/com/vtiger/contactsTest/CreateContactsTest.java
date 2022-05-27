package com.vtiger.contactsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sdet34l1.genericlibrary.BaseClass;
import com.vtiger.objectRepository.ContactInformationPage;
import com.vtiger.objectRepository.ContactPage;
import com.vtiger.objectRepository.CreateNewContactPage;

public class CreateContactsTest extends BaseClass
{
	
	String contactName;
	ContactPage contactpage;
	CreateNewContactPage createnewcontactpage;
	ContactInformationPage contactinformationpage;
	
	@Test(groups="sanity")
	public void createContactsTest() throws IOException
	{
		contactName = excelUtility.DataFromExcel("contact",3 , 1)+randomnumber;
		
		contactpage = new ContactPage(driver);
		createnewcontactpage = new CreateNewContactPage(driver);
		contactinformationpage = new ContactInformationPage(driver);
		
		homepage.clickContact();
		contactpage.clickContactImg(driver);
		createnewcontactpage.contactCreateandSave(contactName);
		//jutil.assertionThroughIfCondition(contactinformationpage.getContactName(), contactName,"Contact is ");	
		
	}
}




































