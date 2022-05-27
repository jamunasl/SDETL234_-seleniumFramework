package com.vtiger.productsTest;

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
import com.vtiger.objectRepository.CreateNewCampaignPage;
import com.vtiger.objectRepository.CreateNewProductPage;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;
import com.vtiger.objectRepository.ProductInformationPage;
import com.vtiger.objectRepository.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductsTest extends BaseClass
{
	String expectedproductName;
	ProductPage productpage;
	CreateNewProductPage createnewproductpage;
	ProductInformationPage productinformationpage;
	
	@Test
	public void createProductsTest() throws IOException
	{
		expectedproductName = excelUtility.DataFromExcel("ProductTest",5,2)+randomnumber;
		productpage = new ProductPage(driver);
		createnewproductpage = new CreateNewProductPage(driver);
		productinformationpage = new ProductInformationPage(driver);
		
		homepage.clickProduct();
		productpage.clickProductImg(driver);	
		createnewproductpage.productCreateandSave(expectedproductName);
		jutil.assertionThroughIfCondition(productinformationpage.getProductName(),expectedproductName,"Product Name is ");		
	}
}
	
	
	
	




























/*
 * public static void main(String[] args) throws IOException, InterruptedException 
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
		ProductPage productpage = new ProductPage(driver);
		CreateNewProductPage createnewproductpage = new CreateNewProductPage(driver);
		ProductInformationPage productinformationpage = new ProductInformationPage(driver);
		
		WebDriverUtility.launchApp(url, driver);
		
		loginpage.loginAction(userName, password);
		//create product
		homepage.clickProduct();
		productpage.clickProductImg(driver);	
		createnewproductpage.productCreateandSave(ExpectedproductName);
		jutil.assertionThroughIfCondition(productinformationpage.getProductName(),ExpectedproductName,"Product Name is ");
		homepage.signOut(driver);
		WebDriverUtility.quitBrowser(driver);
		}
}
 * 
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
	
	String productName = ExcelUtility.getDataFromExcel("ProductTest",2,1)+randomnumber;
	
	
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

	WebDriverUtility.launchApp(url, driver);
	WebDriverUtility.browserSetting(longtimeout, driver);
	WebDriverUtility.explicitlyWait(driver, longtimeout);
	driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(username);
	driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
	
//	if(driver.getTitle().contains("Home")) 
	String hometitle = driver.getTitle();
	hometitle.contains("Home");
	jutil.assertionThroughIfCondition(hometitle, hometitle, "home page");
	{
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 1, 4, "Home page is displayed");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 1, 5, "Pass");
		jutil.printStatement("login");
	}

	driver.findElement(By.xpath("//a[text()='Products']")).click();
//	if(driver.getTitle().contains("Products")) 
	String producttitle = driver.getTitle();
	producttitle.contains("Products");
	jutil.assertionThroughIfCondition(producttitle, producttitle, "product page");
	{
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 2, 4, "product page is displayed");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 2, 5, "Pass");
		jutil.printStatement("product");
	}
	
	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//	if(driver.getTitle().contains("Products")) 
	String createproducttitle = driver.getTitle();
	createproducttitle.contains("Products");
	jutil.assertionThroughIfCondition(createproducttitle, createproducttitle, "create product");
	{
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 3, 4, "create product page is displayed");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 3, 5, "Pass");
		jutil.printStatement("create product");
	}
	driver.findElement(By.cssSelector("[name='productname']")).sendKeys(productName);
	driver.findElement(By.cssSelector("[value='  Save  ']")).click();
	String proName = driver.findElement(By.id("mouseArea_Product Name")).getText();
	proName=proName.trim();
	
	jutil.assertionThroughIfCondition(proName, productName, "proName name");
	{
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 4, 4, "product name is added");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 4, 5, "Pass");
		jutil.printStatement("product name");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 5, 4, "product name is valid");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 5, 5, "Pass");
		jutil.printStatement("product name is valid");
	}
	
	WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
	WebDriverUtility.mouseHoverOntheElement(logout, driver);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//	if(driver.getTitle().contains("Commercial Open"))
	String logouttitle = driver.getTitle();
	logouttitle.contains("Commercial Open");
	jutil.assertionThroughIfCondition(logouttitle, logouttitle, "home page");
	{
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 6, 4, "login page is displayed");
		ExcelUtility.setDataIntoExcel("ProductTestScripts", 6, 5, "Pass");
		jutil.printStatement("logout");
	}
	ExcelUtility.saveDataIntoExcel(IconstantPath.EXCELFILEPATH);
	WebDriverUtility.quitBrowser(driver);
	}

*/