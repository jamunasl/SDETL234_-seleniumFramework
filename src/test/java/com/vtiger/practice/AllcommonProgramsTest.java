package com.vtiger.practice;

public class AllcommonProgramsTest {
	/*
	 * public static void main(String[] args) throws IOException, InterruptedException 
		{	
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			WebDriver driver = null;
			JavaUtility jutil = new JavaUtility();
			int randomnumber = jutil.getRandomNumber(1000);
			String url = FileUtility.getDataFromPropertyFile("url");
			String userName = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			String campaignname = ExcelUtility.getDataFromExcel("ProductTest",5,1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			WebDriverUtility.initializeActions(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			HomePage homepage = new HomePage(driver);
			CampaignPage campaignpame = new CampaignPage(driver);
			CreateNewCampaignPage createnewcampaignpage = new CreateNewCampaignPage(driver);
			CampaignInformationPage campaigninformationpage = new CampaignInformationPage(driver);
			
			WebDriverUtility.launchApp(url, driver);
			
			loginpage.loginAction(userName, password);
			homepage.clickCampaign(driver);
			campaignpame.clickCampaignImg(driver);
			createnewcampaignpage.campaignCreateandSave(campaignname);
			
			jutil.printStatement("Expected Name is :"+campaignname);
			jutil.assertionThroughIfCondition(campaigninformationpage.getCampaignName(), campaignname, "Campaign ");
			homepage.signOut(driver);
			WebDriverUtility.quitBrowser(driver);
			}
	 */





















	/*

	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		WebDriver driver = null;
		JavaUtility jutil = new JavaUtility();
		int randomnumber = jutil.getRandomNumber(1000);
		String url = FileUtility.getDataFromPropertyFile("url");
		String username = FileUtility.getDataFromPropertyFile("username");
		String password = FileUtility.getDataFromPropertyFile("password");
		String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
		String browser = FileUtility.getDataFromPropertyFile("browser");
		
		String campaignname = ExcelUtility.getDataFromExcel("ProductTest",5,1)+randomnumber;
		
		jutil.printStatement(campaignname);
		
		long longtimeout = Long.parseLong(timeouts);
		switch (browser)
		{
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	
		
		
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		
		LoginPage loginpage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		CampaignPage campaignpame = new CampaignPage(driver);
		CreateNewCampaignPage createnewcampaignpage = new CreateNewCampaignPage(driver);
		CampaignInformationPage campaigninformationpage = new CampaignInformationPage(driver);
		
		
		WebDriverUtility.launchApp(url, driver);
		WebDriverUtility.browserSetting(longtimeout, driver);
		WebDriverUtility.explicitlyWait(driver, longtimeout);
		WebDriverUtility.initializeActions(driver);
		
		
		loginpage.loginAction(username, password);
		homepage.clickCampaign(driver);
		
//		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
//		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
		
//		if(driver.getTitle().contains("Home"))
//		{
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 1, 4, "Login Page is Displayed");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 1, 5, "Pass");
//			jutil.printStatement("Login");
//		}
		
		
//		WebElement moreLink = driver.findElement(By.xpath("//a[text()='More']"));
//		WebDriverUtility.mouseHoverOntheElement(moreLink, driver);
//		driver.findElement(By.cssSelector("[name='Campaigns']")).click();
//		String camnametitle = driver.getTitle();
//		jutil.assertionThroughIfCondition(camnametitle, camnametitle, "campaign name");
	//
//		{
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 2, 4, "Campaign Page is Displayed");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 2, 5, "Pass");
//			jutil.printStatement("Campaign");
//		}
		
		campaignpame.clickCampaignImg(driver);
//		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
//		String camtitle=driver.getTitle();
//		jutil.assertionThroughIfCondition(camtitle, camtitle, "create campaignname");
	//
//		{
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 3, 4, "Campaign Page is Displayed");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 3, 5, "Pass");
//			jutil.printStatement("Create Campaign");
//		}
		
		createnewcampaignpage.campaignCreateandSave(driver, campaignname);
//		driver.findElement(By.cssSelector("[name='campaignname']")).sendKeys(campaignname);
//		driver.findElement(By.cssSelector("[class='crmButton small save']")).click();
		
		
//		String actualcampaignName = campaigninformationpage.getCampaignName().trim();
//		String camName = driver.findElement(By.id("mouseArea_Campaign Name")).getText();
//		String getCampaignNameactual = getCampaignName.trim();
		
		jutil.assertionThroughIfCondition(campaigninformationpage.getCampaignName(), campaignname, "Campaign");
//		String pagename = driver.findElement(By.className("dvHeaderText")).getText();
//		jutil.assertionThroughIfCondition(pagename, campaignname, "campaign name");
//		{
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 4, 4, "Campaign name added");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 4, 5, "Pass");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 5, 4, "Campaign name is valid");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 5, 5, "Pass");
//			jutil.printStatement("Valid");
//		}
		
		
		homepage.signOut(driver);
//		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
//		WebDriverUtility.mouseHoverOntheElement(logout, driver);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//		String logouttitle=driver.getTitle();
	//	
//		jutil.assertionThroughIfCondition(logouttitle, logouttitle, "Logout");
//		{
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 6, 4, "Login Page is Displayed");
//			ExcelUtility.setDataIntoExcel("CreateCampaignScripts", 6, 5, "pass");
//			jutil.printStatement("Logout");
//		}
		
		ExcelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
		ExcelUtility.closeExcel();
		WebDriverUtility.quitBrowser(driver);
		}


	*/

 //create comapign wiyh product

	/*
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		JavaUtility jutil = new JavaUtility();
		String url = FileUtility.getDataFromPropertyFile("url");
		String userName = FileUtility.getDataFromPropertyFile("username");
		String password = FileUtility.getDataFromPropertyFile("password");
		String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
		String browser = FileUtility.getDataFromPropertyFile("browser");
		
		int randomnumber = jutil.getRandomNumber(1000);
		String ExpectedproductName = ExcelUtility.getDataFromExcel("ProductTest",5,2)+randomnumber;
	
		String organizationName = ExcelUtility.getDataFromExcel("ProductTest",5,1)+randomnumber;
		//book.close();
		
		long longtimeout = Long.parseLong(timeouts);
		WebDriver driver = null;
		
		switch (browser)
		{
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	
		
		
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		
		
		WebDriverUtility.browserSetting(longtimeout, driver);
		WebDriverUtility.explicitlyWait(driver, longtimeout);
		WebDriverUtility.initializeActions(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		CampaignPage campaignpame = new CampaignPage(driver);
		CreateNewCampaignPage createnewcampaignpage = new CreateNewCampaignPage(driver);
		CampaignInformationPage campaigninformationpage = new CampaignInformationPage(driver);
		ProductPage productpage = new ProductPage(driver);
		CreateNewProductPage createnewproductpage = new CreateNewProductPage(driver);
		SearchProductPage searchproductpage = new SearchProductPage(driver);
		
		
		WebDriverUtility.launchApp(url, driver);
		
		loginpage.loginAction(userName, password);
		homepage.clickCampaign(driver);
		campaignpame.clickCampaignImg(driver);
		
		
		//create product
		homepage.clickProduct();
		productpage.clickProductImg(driver);	
		createnewproductpage.productCreateandSave(ExpectedproductName);
		
		//create campaign
		homepage.clickCampaign(driver);
		campaignpame.clickCampaignImg(driver);
		createnewcampaignpage.enterCampaignNameAndSwitchtoSearchProduct(organizationName);
		searchproductpage.selectProduct(ExpectedproductName, driver);
		createnewcampaignpage.saveCampaign();
		campaigninformationpage.getCampaignName();
		jutil.assertionThroughIfCondition(campaigninformationpage.getCampaignName(),organizationName, "Campaign with Product ");
		homepage.signOut(driver);
		WebDriverUtility.quitBrowser(driver);
	
	*/
	
	
	























/*
 * public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
		ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
		JavaUtility jutil = new JavaUtility();
		String url = FileUtility.getDataFromPropertyFile("url");
		String username = FileUtility.getDataFromPropertyFile("username");
		String password = FileUtility.getDataFromPropertyFile("password");
		String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
		String browser = FileUtility.getDataFromPropertyFile("browser");
		
		int randomnumber = jutil.getRandomNumber(1000);
		String productName = ExcelUtility.getDataFromExcel("ProductTest",5,2)+randomnumber;
	
		String ls1 = ExcelUtility.getDataFromExcel("ProductTest",5,1)+randomnumber;
		//book.close();
		
		long longtimeout = Long.parseLong(timeouts);
		WebDriver driver = null;
		
		switch (browser)
		{
		case "chrome":
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	
		
		
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		
		WebDriverUtility.launchApp(url, driver);
		WebDriverUtility.browserSetting(longtimeout, driver);
		WebDriverUtility.explicitlyWait(driver, longtimeout);
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//create product
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.cssSelector("[name='productname']")).sendKeys(productName);
		driver.findElement(By.cssSelector("[value='  Save  ']")).click();		
		String proName = driver.findElement(By.id("mouseArea_Product Name")).getText();
		proName=proName.trim();
		
		//create campaign
		WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
		WebDriverUtility.mouseHoverOntheElement(more, driver);
		
		driver.findElement(By.cssSelector("[name='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.cssSelector("[name='campaignname']")).sendKeys(ls1);
		driver.findElement(By.cssSelector("[title='Select']")).click();
		
		WebDriverUtility.switchToWindowBasedOnTitle(driver,"Products");
		
		driver.findElement(By.id("search_txt")).sendKeys(ls1);
		driver.findElement(By.cssSelector("[name='search']")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'set_return_specific')]")).click();
		
		WebDriverUtility.switchToWindowBasedOnTitle(driver, "Campaign");
		
		driver.findElement(By.cssSelector("[class='crmButton small save']")).click();
		String camName = driver.findElement(By.id("mouseArea_Campaign Name")).getText();
		camName=camName.trim();
		jutil.assertionThroughIfCondition(camName, ls1, "Campaign with Product");
		jutil.assertionThroughIfCondition(proName, productName, "");
	
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		WebDriverUtility.mouseHoverOntheElement(logout, driver);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		ExcelUtility.closeExcel();
		WebDriverUtility.quitBrowser(driver);
	}
 */

//contact
	/*
	 * public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
		{
			JavaUtility jutil = new JavaUtility();
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String contactName = ExcelUtility.getDataFromExcel("CreateContact", 2, 1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			WebDriverUtility.initializeActions(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			HomePage homepage = new HomePage(driver);
			ContactPage contactpage = new ContactPage(driver);
			CreateNewContactPage createnewcontactpage = new CreateNewContactPage(driver);
			ContactInformationPage contactinformationpage = new ContactInformationPage(driver);
			
			WebDriverUtility.launchApp(url, driver);
			
			loginpage.loginAction(username, password);
			homepage.clickContact();
			contactpage.clickContactImg(driver);
			createnewcontactpage.contactCreateandSave(contactName);
			jutil.assertionThroughIfCondition(contactinformationpage.getContactName(), contactName,"Contact is "); ;
			homepage.signOut(driver);
			WebDriverUtility.quitBrowser(driver);
	 * 
	 */





















	/*
	 * public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
		{
			JavaUtility jutil = new JavaUtility();
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String contactName = ExcelUtility.getDataFromExcel("CreateContact", 2, 1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
			WebDriverUtility.launchApp(url, driver);
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
			driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			String title=driver.getTitle();
			
			jutil.assertionThroughIfCondition(title, title, "create contact");
			{
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 4, "Home Page is Displayed");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 5, "Pass");
				jutil.printStatement("Login");
			}
			
			driver.findElement(By.xpath("//a[text()='Contacts']/../../td[8]")).click();
			jutil.assertionThroughIfCondition(title, title, "contact");
			{
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 2, 4, "Contacts Page is Displayed");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 2, 5, "Pass");
				jutil.printStatement("Contact");
			}
			
			driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
			jutil.assertionThroughIfCondition(title, title, "create contact");
			{
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 3, 4, "CreateContacts Page is Displayed");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 3, 5, "Pass");
				jutil.printStatement("create");
			}
			
			driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(contactName);
			driver.findElement(By.cssSelector("input.crmButton.small.save")).click();
			String Actualcn = driver.findElement(By.id("mouseArea_Last Name")).getText();
			Thread.sleep(2000);
			Actualcn=Actualcn.trim();
			
			String title1 = driver.getTitle();
			title1.contains("Commercial Open");
			jutil.assertionThroughIfCondition(title1, title1 , "lastName");
			jutil.assertionThroughIfCondition(Actualcn, contactName, "create contact");
			
			{
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 4, 4, "Last name added");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 4, 5, "Pass");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 5, 4, "Last name ais valid");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 5, 5, "Pass");
			}
			
			WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
			WebDriverUtility.mouseHoverOntheElement(logout, driver);
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			
			String logouttitle = driver.getTitle();
			jutil.assertionThroughIfCondition(logouttitle, logouttitle,"Logout");
			{
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 6, 4, "Login Page is Displayed");
				ExcelUtility.setDataIntoExcel("ContactTestScripts", 6, 5, "Pass");
				jutil.printStatement("Logout");
			}
			ExcelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
			ExcelUtility.closeExcel();
			WebDriverUtility.quitBrowser(driver);
		}
	 * 
	 */
	/*
	 * public static void main(String[] args) throws IOException 
		{
				FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
				ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
				JavaUtility jutil = new JavaUtility();			
				String url = FileUtility.getDataFromPropertyFile("url");
				String username = FileUtility.getDataFromPropertyFile("username");
				String password = FileUtility.getDataFromPropertyFile("password");
				String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
				String browser = FileUtility.getDataFromPropertyFile("browser");
				
				int randomnumber = jutil.getRandomNumber(1000);
				String contactName = ExcelUtility.getDataFromExcel("CreateContact",5,2)+randomnumber;
				String organizationName = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
				
				
				long longtimeout = Long.parseLong(timeouts);
				WebDriver driver = null;
				
				switch (browser)
				{
				case "chrome":
				
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
					
				case "firefox":
				
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
					
				case "edge":
				
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;	
				
				
				default:
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
				}
				
				WebDriverUtility.browserSetting(longtimeout, driver);
				WebDriverUtility.explicitlyWait(driver, longtimeout);
				WebDriverUtility.initializeActions(driver);
				
				LoginPage loginpage = new LoginPage(driver);
				HomePage homepage = new HomePage(driver);
				ContactPage contactpage = new ContactPage(driver);
				CreateNewContactPage createnewcontactpage = new CreateNewContactPage(driver);
				ContactInformationPage contactinformationpage = new ContactInformationPage(driver);
				SearchOrganizationPage searchorganizationpage = new SearchOrganizationPage(driver);
				
				
				WebDriverUtility.launchApp(url, driver);
				loginpage.loginAction(username, password);
				
				//contact
				homepage.clickContact();
				contactpage.clickContactImg(driver);
				createnewcontactpage.enterContactNameAndSwitchtoSearchOrganization(contactName);
				searchorganizationpage.selectOrganization(organizationName, driver);
				createnewcontactpage.saveContact();
				jutil.assertionThroughIfCondition(contactinformationpage.getContactName(), contactName,"Contact with Organization ");
				homepage.signOut(driver);
				WebDriverUtility.quitBrowser(driver);
		}
	}
	 */





































	/*
	 * public static void main(String[] args) throws IOException 
		{
				FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
				ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
				JavaUtility jutil = new JavaUtility();			
				String url = FileUtility.getDataFromPropertyFile("url");
				String username = FileUtility.getDataFromPropertyFile("username");
				String password = FileUtility.getDataFromPropertyFile("password");
				String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
				String browser = FileUtility.getDataFromPropertyFile("browser");
				
				int randomnumber = jutil.getRandomNumber(1000);
				String ls = ExcelUtility.getDataFromExcel("CreateContact",5,2)+randomnumber;
				jutil.printStatement(ls);
				String ls1 = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
				jutil.printStatement(ls1);
				//book.close();
				
				long longtimeout = Long.parseLong(timeouts);
				WebDriver driver = null;
				
				switch (browser)
				{
				case "chrome":
				
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
					
				case "firefox":
				
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
					
				case "edge":
				
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;	
				
				
				default:
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
				}
				
				WebDriverUtility.launchApp(url, driver);
				WebDriverUtility.browserSetting(longtimeout, driver);
				WebDriverUtility.explicitlyWait(driver, longtimeout);
				driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
				driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
				driver.findElement(By.id("submitButton")).click();
				
				//if(driver.getTitle().contains("Home")) 
//				{
//					ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 4, "Home Page is Displayed");
//					ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 5, "Pass");
//					jutil.printStatement("Login");
//				}
				
				//organization
				driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				//String orgName = "gtiger";
				
				driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(ls1);
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
				org=org.trim();
				
				
				jutil.assertionThroughIfCondition(org, ls1,"Org with contact");
				
				//contacts
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
				driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(ls);
				
				//driver.findElement(By.cssSelector("input.crmButton.small.save")).click();
				//String con = driver.findElement(By.id("mouseArea_Last Name")).getText();
				
				driver.findElement(By.xpath("//img[@title='Select']")).click();
				WebDriverUtility.switchToWindowBasedOnTitle(driver, "Accounts&action");
				
				driver.findElement(By.id("search_txt")).sendKeys(ls1);
				driver.findElement(By.cssSelector("[name='search']")).click();
				driver.findElement(By.xpath("//a[contains(@onclick,'set_return_contact_address')]")).click();
				
				WebDriverUtility.switchToWindowBasedOnTitle(driver, "Contacts");
				driver.findElement(By.cssSelector("[class='crmButton small save']")).click();
				//String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
				
				String conName=driver.findElement(By.id("mouseArea_Last Name")).getText();
				
				jutil.assertionThroughIfCondition(org, ls1, "Organization with contact");
				jutil.assertionThroughIfCondition(conName, ls, "");
			
				WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
				WebDriverUtility.mouseHoverOntheElement(logout, driver);
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				WebDriverUtility.quitBrowser(driver);
		}
	 * 
	 */
	/*
	 * public static void main(String[] args) throws IOException 
		{
				FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
				ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
				JavaUtility jutil = new JavaUtility();			
				String url = FileUtility.getDataFromPropertyFile("url");
				String username = FileUtility.getDataFromPropertyFile("username");
				String password = FileUtility.getDataFromPropertyFile("password");
				String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
				String browser = FileUtility.getDataFromPropertyFile("browser");
				
				int randomnumber = jutil.getRandomNumber(1000);
				String contactName = ExcelUtility.getDataFromExcel("CreateContact",5,2)+randomnumber;
				String organizationName = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
				
				
				long longtimeout = Long.parseLong(timeouts);
				WebDriver driver = null;
				
				switch (browser)
				{
				case "chrome":
				
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
					
				case "firefox":
				
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
					
				case "edge":
				
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;	
				
				
				default:
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
				}
				
				WebDriverUtility.browserSetting(longtimeout, driver);
				WebDriverUtility.explicitlyWait(driver, longtimeout);
				WebDriverUtility.initializeActions(driver);
				
				LoginPage loginpage = new LoginPage(driver);
				HomePage homepage = new HomePage(driver);
				ContactPage contactpage = new ContactPage(driver);
				CreateNewContactPage createnewcontactpage = new CreateNewContactPage(driver);
				ContactInformationPage contactinformationpage = new ContactInformationPage(driver);
				SearchOrganizationPage searchorganizationpage = new SearchOrganizationPage(driver);
				
				
				WebDriverUtility.launchApp(url, driver);
				loginpage.loginAction(username, password);
				
				//contact
				homepage.clickContact();
				contactpage.clickContactImg(driver);
				createnewcontactpage.enterContactNameAndSwitchtoSearchOrganization(contactName);
				searchorganizationpage.selectOrganization(organizationName, driver);
				createnewcontactpage.saveContact();
				jutil.assertionThroughIfCondition(contactinformationpage.getContactName(), contactName,"Contact with Organization ");
				homepage.signOut(driver);
				WebDriverUtility.quitBrowser(driver);
		}
	}
	 */





































	/*
	 * public static void main(String[] args) throws IOException 
		{
				FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
				ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
				JavaUtility jutil = new JavaUtility();			
				String url = FileUtility.getDataFromPropertyFile("url");
				String username = FileUtility.getDataFromPropertyFile("username");
				String password = FileUtility.getDataFromPropertyFile("password");
				String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
				String browser = FileUtility.getDataFromPropertyFile("browser");
				
				int randomnumber = jutil.getRandomNumber(1000);
				String ls = ExcelUtility.getDataFromExcel("CreateContact",5,2)+randomnumber;
				jutil.printStatement(ls);
				String ls1 = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
				jutil.printStatement(ls1);
				//book.close();
				
				long longtimeout = Long.parseLong(timeouts);
				WebDriver driver = null;
				
				switch (browser)
				{
				case "chrome":
				
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
					
				case "firefox":
				
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
					
				case "edge":
				
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					break;	
				
				
				default:
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
				}
				
				WebDriverUtility.launchApp(url, driver);
				WebDriverUtility.browserSetting(longtimeout, driver);
				WebDriverUtility.explicitlyWait(driver, longtimeout);
				driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
				driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
				driver.findElement(By.id("submitButton")).click();
				
				//if(driver.getTitle().contains("Home")) 
//				{
//					ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 4, "Home Page is Displayed");
//					ExcelUtility.setDataIntoExcel("ContactTestScripts", 1, 5, "Pass");
//					jutil.printStatement("Login");
//				}
				
				//organization
				driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				//String orgName = "gtiger";
				
				driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(ls1);
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
				org=org.trim();
				
				
				jutil.assertionThroughIfCondition(org, ls1,"Org with contact");
				
				//contacts
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
				driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(ls);
				
				//driver.findElement(By.cssSelector("input.crmButton.small.save")).click();
				//String con = driver.findElement(By.id("mouseArea_Last Name")).getText();
				
				driver.findElement(By.xpath("//img[@title='Select']")).click();
				WebDriverUtility.switchToWindowBasedOnTitle(driver, "Accounts&action");
				
				driver.findElement(By.id("search_txt")).sendKeys(ls1);
				driver.findElement(By.cssSelector("[name='search']")).click();
				driver.findElement(By.xpath("//a[contains(@onclick,'set_return_contact_address')]")).click();
				
				WebDriverUtility.switchToWindowBasedOnTitle(driver, "Contacts");
				driver.findElement(By.cssSelector("[class='crmButton small save']")).click();
				//String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
				
				String conName=driver.findElement(By.id("mouseArea_Last Name")).getText();
				
				jutil.assertionThroughIfCondition(org, ls1, "Organization with contact");
				jutil.assertionThroughIfCondition(conName, ls, "");
			
				WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
				WebDriverUtility.mouseHoverOntheElement(logout, driver);
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				WebDriverUtility.quitBrowser(driver);
		}
	 * 
	 */
	//Document
	/*
	 * public static void main(String[] args) throws IOException, AWTException, InterruptedException 
		{
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String documenttitle = ExcelUtility.getDataFromExcel("ProductTest", 8, 1)+randomnumber;
			String documentpath = ExcelUtility.getDataFromExcel("ProductTest", 8, 2);
			String documentdescription = ExcelUtility.getDataFromExcel("ProductTest", 8, 3);
			String documentfileName = ExcelUtility.getDataFromExcel("ProductTest", 8, 4);
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			WebDriverUtility.initializeActions(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			HomePage homepage = new HomePage(driver);
			DocumentPage documentpage = new DocumentPage(driver);
			CreateNewDocumentPage createNewdocumentpage= new CreateNewDocumentPage(driver);
			DocumentInformationPage documentinformationpage = new DocumentInformationPage(driver);
			
			WebDriverUtility.launchApp(url, driver);
			
			loginpage.loginAction(username, password);
			homepage.clickDocument();
			documentpage.clickCreateDocument();
			createNewdocumentpage.createDocuments(documenttitle);
			createNewdocumentpage.enterDescription(driver, documentdescription);
			createNewdocumentpage.scrollTillElementPage(driver);
			createNewdocumentpage.fileInformationFill(driver, documentfileName, 1);
			createNewdocumentpage.documentSave();
			jutil.printStatement(documentinformationpage.getUpdatedTitle());
			jutil.printStatement("Document created Successfully");
			homepage.signOut(driver);
			WebDriverUtility.quitBrowser(driver);
			}
	 * 
	 */





















	/*
	 * public static void main(String[] args) throws IOException, AWTException, InterruptedException 
		{
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
//			DataFormatter format = new DataFormatter();
			
//			Sheet s=book.getSheet("ProductTest");
//			Row r=s.getRow(8);
//			Cell ctitle=r.getCell(1);
//			Cell cpath=r.getCell(2);
//			Cell cdescription=r.getCell(3);
			
			int randomnumber = jutil.getRandomNumber(1000);
			String documenttitle = ExcelUtility.getDataFromExcel("ProductTest", 8, 1)+randomnumber;
			String documentpath = ExcelUtility.getDataFromExcel("ProductTest", 8, 2);
			String documentdescription = ExcelUtility.getDataFromExcel("ProductTest", 8, 3);
			
//			String documenttitle = format.formatCellValue(ctitle)+randomnumber;//.getStringCellValue()+num;
//			String documentdescription = format.formatCellValue(cdescription);//.getStringCellValue();
//			String documentpath = format.formatCellValue(cpath);//.getStringCellValue();
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
			WebDriverUtility.launchApp(url, driver);
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
			driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			
			String logintitle = driver.getTitle();
			logintitle.contains("Home");
			jutil.assertionThroughIfCondition(logintitle, logintitle, "Home");
			//if(driver.getTitle().contains("Home"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 1, 4, "Login Page is Displayed");
				ExcelUtility.setDataIntoExcel("Documents", 1, 5, "Pass");
				jutil.printStatement("Login");
			}
			
			driver.findElement(By.xpath("//a[text()='Documents']")).click();
			
			String documentstitle = driver.getTitle();
			documentstitle.contains("Documents");
			jutil.assertionThroughIfCondition(documentstitle, documentstitle, "Documents");
			//if(driver.getTitle().contains("Documents"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 2, 4, "Documents Page is Displayed");
				ExcelUtility.setDataIntoExcel("Documents", 2, 5, "Pass");
				jutil.printStatement("documents");
			}
			
			driver.findElement(By.cssSelector("[title='Create Document...']")).click();
			
			String documentstitle1 = driver.getTitle();
			documentstitle1.contains("Documents");
			jutil.assertionThroughIfCondition(documentstitle1, documentstitle1, "Documents");
			//if(driver.getTitle().contains("Documents"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 3, 4, "Create Documents Page is Displayed");
				ExcelUtility.setDataIntoExcel("Documents", 3, 5, "Pass");
				jutil.printStatement("Create");
			}
			
			driver.findElement(By.cssSelector("[name='notes_title']")).sendKeys(documenttitle);
			
			String documentstitle2 = driver.getTitle();
			documentstitle2.contains("Documents");
			jutil.assertionThroughIfCondition(documentstitle2, documentstitle2, "Documents");
			//if(driver.getTitle().contains("Documents"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 4, 4, "Title is added");
				ExcelUtility.setDataIntoExcel("Documents", 4, 5, "Pass");
				jutil.printStatement("Created");
			}
			
			String t = driver.getTitle();
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").perform();
			act.keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("c").perform();
			act.keyUp(Keys.CONTROL).perform();
			
			//paste the text and Bold and italic
			WebDriverUtility.switchToFrame(driver, 0);
			//driver.switchTo().frame(0);
			driver.findElement(By.cssSelector("[class='cke_show_borders']")).sendKeys(documentdescription);
			act = new Actions(driver);
			//act.moveToElement(paste).perform();
			act.keyDown(Keys.CONTROL).sendKeys("v").perform();
			act.keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("a").perform();
			act.keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("b").perform();
			act.keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("i").perform();
			act.keyUp(Keys.CONTROL).perform();
			
			WebDriverUtility.switchBackToHomeWebPage(driver);
			//driver.switchTo().defaultContent();

			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_PAGE_DOWN);
			r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			//jutil.customWait(null, longtimeout, 10);
			Thread.sleep(2000);
			
			//file information
			WebElement document = driver.findElement(By.cssSelector("[title='Create Document...']"));
			r1 = new Robot();
			r1.keyPress(KeyEvent.VK_PAGE_DOWN);
			r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			JavaUtility.customWait(document, longtimeout, 10);
			
			//Thread.sleep(1000);
			
			//file type
			driver.findElement(By.cssSelector("[name='filelocationtype']")).click();
			r1=new Robot();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.cssSelector("[name='filename']")).sendKeys(documentpath);
			driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
			String title = driver.findElement(By.id("mouseArea_Title")).getText();
			title=title.trim();
			String DocumentTitle = "my files";
			jutil.assertionThroughIfCondition(title, DocumentTitle,"My Files");
//			if(driver.getTitle().contains("Documents"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 5, 4, "File is valid");
				ExcelUtility.setDataIntoExcel("Documents", 5, 5, "Pass");
				jutil.printStatement("valid");
			}
			
			WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
			WebDriverUtility.mouseHoverOntheElement(logout, driver);
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			
			String logouttitle = driver.getTitle();
			logouttitle.contains("Commercial Open");
			jutil.assertionThroughIfCondition(logouttitle, logouttitle, "Logout");
//			if(driver.getTitle().contains("Commercial Open"))
			{
				ExcelUtility.setDataIntoExcel("Documents", 6, 4, "Login Page is Displayed");
				ExcelUtility.setDataIntoExcel("Documents", 6, 5, "Pass");
				jutil.printStatement("Logout");
			}
			ExcelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
			ExcelUtility.closeExcel();
			WebDriverUtility.quitBrowser(driver);
			}
	 */ 

	
	
	
	//organizatio
	/*
	 * public static void main(String[] args) throws IOException 
		{
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();			
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String organizationName = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			WebDriverUtility.initializeActions(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			HomePage homepage = new HomePage(driver);
			OrganizationInformationPage organizationinformationpage= new OrganizationInformationPage(driver);
			OrganizationPage organizationpage = new OrganizationPage(driver);
			CreateNewOrganizationPage createneworganizationpage = new CreateNewOrganizationPage(driver);
			
			
			WebDriverUtility.launchApp(url, driver);
			loginpage.loginAction(username, password);
			homepage.clickOrganization();
			organizationpage.clickCreateOrganization(driver);
			createneworganizationpage.organizationCreateandSave(organizationName);
			jutil.assertionThroughIfCondition(organizationinformationpage.getOrganizationName(), organizationName,"Organization is ");
			homepage.signOut(driver);
			WebDriverUtility.quitBrowser(driver);
		}
	}
	 * 
	 */




















	/*
	 * public static void main(String[] args) throws IOException 
		{
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();			
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String ls = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

			WebDriverUtility.launchApp(url, driver);
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
			driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(ls);
			driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
			String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
			jutil.printStatement(org);
		
			jutil.assertionThroughIfCondition(org,ls,"Organization");
			
			WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
			WebDriverUtility.mouseHoverOntheElement(logout, driver);
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			WebDriverUtility.quitBrowser(driver);
		}
		
	 */
	/*
	 * public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{	
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();		
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			String visibletextindustry = FileUtility.getDataFromPropertyFile("industry");
			String visibletexttype = FileUtility.getDataFromPropertyFile("type");
			
			
			int randomnumber = jutil.getRandomNumber(1000);
			String organizationName = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			WebDriverUtility.initializeActions(driver);
			
			LoginPage loginpage = new LoginPage(driver);
			HomePage homepage = new HomePage(driver);
			OrganizationInformationPage organizationinformationpage= new OrganizationInformationPage(driver);
			OrganizationPage organizationpage = new OrganizationPage(driver);
			CreateNewOrganizationPage createneworganizationpage = new CreateNewOrganizationPage(driver);
			
			
			WebDriverUtility.launchApp(url, driver);
			loginpage.loginAction(username, password);
			homepage.clickOrganization();
			organizationpage.clickCreateOrganization(driver);
			createneworganizationpage.enterOrganizationName(organizationName);
			createneworganizationpage.selectIndustry(driver, visibletextindustry);
			createneworganizationpage.selectType(driver, visibletexttype);
			createneworganizationpage.saveOrganization();
			jutil.assertionThroughIfCondition(organizationinformationpage.getOrganizationName(),organizationName,"Organization with select industry and type ");
			homepage.signOut(driver);
			WebDriverUtility.quitBrowser(driver);
		}
	}
	 */
























	/*
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{	
			FileUtility.openPropertyFile(IconstantPath.PROPERTYFILEPATH);
			ExcelUtility.openExcel(IconstantPath.EXCELFILEPATH);
			JavaUtility jutil = new JavaUtility();			
			String url = FileUtility.getDataFromPropertyFile("url");
			String username = FileUtility.getDataFromPropertyFile("username");
			String password = FileUtility.getDataFromPropertyFile("password");
			String timeouts = FileUtility.getDataFromPropertyFile("timeouts");
			String browser = FileUtility.getDataFromPropertyFile("browser");
			
			int randomnumber = jutil.getRandomNumber(1000);
			String ls = ExcelUtility.getDataFromExcel("CreateContact",5,1)+randomnumber;
			
			long longtimeout = Long.parseLong(timeouts);
			WebDriver driver = null;
			
			switch (browser)
			{
			case "chrome":
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
			
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;	
			
			
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

			WebDriverUtility.launchApp(url, driver);
			WebDriverUtility.browserSetting(longtimeout, driver);
			WebDriverUtility.explicitlyWait(driver, longtimeout);
			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
			driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
//			if(driver.getTitle().contains("Home")) 
			String hometitle = driver.getTitle();
			hometitle.contains("Home");
			jutil.assertionThroughIfCondition(hometitle, hometitle, "home page");
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 1, 4, "Home page is displayed");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 1, 5, "Pass");
				jutil.printStatement("login");
			}
			
			driver.findElement(By.xpath("//a[text()='Organizations']/../../td[6]")).click();
//			if(driver.getTitle().contains("Organizations")) 
			String oraganizationstitle = driver.getTitle();
			oraganizationstitle.contains("Organizations");
			jutil.assertionThroughIfCondition(oraganizationstitle, oraganizationstitle, "org page");
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 2, 4, "organization page is displayed");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 2, 5, "Pass");
				jutil.printStatement("org page");
			}
			
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//			if(driver.getTitle().contains("Organizations")) 
			String createorgtitle = driver.getTitle();
			createorgtitle.contains("Organizations");
			jutil.assertionThroughIfCondition(createorgtitle, createorgtitle, "create org");
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 3, 4, "create organization page is displayed");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 3, 5, "Pass");
				jutil.printStatement("create");
			}
			
			driver.findElement(By.cssSelector("[name='accountname']")).sendKeys(ls);
			
//			if(driver.getTitle().contains("Organizations")) 
			String oraganizationtitle = driver.getTitle();
			oraganizationtitle.contains("Organizations");
			jutil.assertionThroughIfCondition(oraganizationtitle, oraganizationtitle, "organization name is added");
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 4, 4, "organization name is added");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 4, 5, "Pass");
				jutil.printStatement("org name");
			}
			
			WebElement industry=driver.findElement(By.cssSelector("[name='industry']"));
			Select sel = new Select(industry);
			sel.selectByVisibleText("Education");
			
//			if(driver.getTitle().contains("Organizations")) 
			String industrytitle = driver.getTitle();
			industrytitle.contains("Organizations");
			jutil.assertionThroughIfCondition(industrytitle, industrytitle, "industry is seleced");
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 5, 4, "industry is selected");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 5, 5, "Pass");
				jutil.printStatement("selected");
			}
			
			WebElement type = driver.findElement(By.cssSelector("[name='accounttype']"));
			sel= new Select(type);
			sel.selectByVisibleText("Press");
			
//			if(driver.getTitle().contains("Organizations")) 
			String presstitle = driver.getTitle();
			presstitle.contains("Organizations");
			jutil.assertionThroughIfCondition(presstitle, presstitle, "org name");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 6, 4, "press is selected");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 6, 5, "Pass");
				jutil.printStatement("selected");
			
			driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
			String org = driver.findElement(By.id("mouseArea_Organization Name")).getText();
			org=org.trim();
			//if(org.equals(ls))
			jutil.assertionThroughIfCondition(org, ls, "org name");
			
//			if(driver.getTitle().contains("Organizations")) 
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 7, 4, "organization name is valid");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 7, 5, "Pass");
				jutil.printStatement("valid");
			}
			
			WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
			WebDriverUtility.mouseHoverOntheElement(logout, driver);
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			
			String logouttitle = driver.getTitle();
			logouttitle.contains("Commercial Open");
			jutil.assertionThroughIfCondition(logouttitle, logouttitle, "Logout");
//			if(driver.getTitle().contains("Commercial Open"))
			{
				ExcelUtility.setDataIntoExcel("Createorgindustry", 8, 4, "Login Page is Displayed");
				ExcelUtility.setDataIntoExcel("Createorgindustry", 8, 5, "Pass");
				jutil.printStatement("Logout");
			}
			
			ExcelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
			ExcelUtility.closeExcel();
			WebDriverUtility.quitBrowser(driver);
		}
		*/


















}
