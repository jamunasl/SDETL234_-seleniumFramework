package com.sdet34l1.genericlibrary;

import org.openqa.selenium.WebDriver;

import com.vtiger.objectRepository.CampaignInformationPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;

public class GettersandSettersForListerners {
	
	public int randomnumber;
	public  static String password;
	public static  String username;
	public long longtimeout;
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public JavaUtility jutil;
	public WebDriverUtility webdriverutility;
	public FileUtility  fileUtility;
	public String browser;
	public String url;
	public long longTimeOut;
	public CampaignInformationPage campaignInformationPage;
	
	
	
    private	GettersandSettersForListerners() {} 
    
    private static GettersandSettersForListerners instance;
   
    public static GettersandSettersForListerners getInstance()
    {
    	if(instance==null)
    	{
    		instance=new GettersandSettersForListerners();
    	}
		return instance;
    }
	public int getRandomnumber() {
		return randomnumber;
	}

	public void setRandomnumber(int randomnumber) {
		this.randomnumber = randomnumber;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		GettersandSettersForListerners.password = password;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		GettersandSettersForListerners.username = username;
	}

	public long getLongtimeout() {
		return longtimeout;
	}

	public void setLongtimeout(long longtimeout) {
		this.longtimeout = longtimeout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginpage() {
		return loginpage;
	}

	public void setLoginpage(LoginPage loginpage) {
		this.loginpage = loginpage;
	}

	public HomePage getHomepage() {
		return homepage;
	}

	public void setHomepage(HomePage homepage) {
		this.homepage = homepage;
	}

	public JavaUtility getJutil() {
		return jutil;
	}

	public void setJutil(JavaUtility jutil) {
		this.jutil = jutil;
	}

	public WebDriverUtility getWebdriverutility() {
		return webdriverutility;
	}

	public void setWebdriverutility(WebDriverUtility webdriverutility) {
		this.webdriverutility = webdriverutility;
	}

	public FileUtility getFileUtility() {
		return fileUtility;
	}

	public void setFileUtility(FileUtility fileUtility) {
		this.fileUtility = fileUtility;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getLongTimeOut() {
		return longTimeOut;
	}

	public void setLongTimeOut(long longTimeOut) {
		this.longTimeOut = longTimeOut;
	}

	public CampaignInformationPage getCampaignInformationPage() {
		return campaignInformationPage;
	}

	public void setCampaignInformationPage(CampaignInformationPage campaignInformationPage) {
		this.campaignInformationPage = campaignInformationPage;
	}

	//create object cor the objectrepositoryclass
	//loginpage= new LoginPage();	



}