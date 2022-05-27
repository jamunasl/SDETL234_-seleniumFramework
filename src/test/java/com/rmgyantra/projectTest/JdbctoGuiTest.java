package com.rmgyantra.projectTest;

import java.sql.SQLException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sdet34l1.genericlibrary.DataBaseUtility;
import com.sdet34l1.genericlibrary.ExcelUtility;
import com.sdet34l1.genericlibrary.FileUtility;
import com.sdet34l1.genericlibrary.IconstantPath;
import com.sdet34l1.genericlibrary.JavaUtility;
import com.sdet34l1.genericlibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class JdbctoGuiTest 
{
	public static void main(String[] args) throws SQLException, IOException 
	{	
		JavaUtility jutil = new JavaUtility();
		WebDriverUtility webDriverUtility= new WebDriverUtility();
		FileUtility fileUtility = new FileUtility();
		ExcelUtility excelUtility = new ExcelUtility();
		WebDriver driver=null;
		fileUtility.openPropertyFile(IconstantPath.RMGYANTRA_PROPERTIYFILE_PATH);
		excelUtility.openExcel(IconstantPath.RMGYANTRA_EXCELFILE_PATH);
		int randomnumber = jutil.getRandomNumber(1000);
		String projectName=excelUtility.DataFromExcel("projects", 1, 1)+"_"+randomnumber;
		DataBaseUtility.openDBConnection(IconstantPath.DATABASEURL+fileUtility.getDataFromPropertyFile("DBName"),fileUtility.getDataFromPropertyFile("DBUsername"),fileUtility.getDataFromPropertyFile("DBPassword"));
		DataBaseUtility.setDataIntoDataBase("insert into project values('TY_PROJ_0100','ganesh','09/04/2022','"+projectName+"','created','3');");
		DataBaseUtility.closeDBConnection();
		
		
//		try {
//			driver1= new Driver();
//		String input="insert into project values('TY_PROJ_036','ganesh','27/04/2022','"+projectName+"','created','3')";
//		DriverManager.registerDriver(driver1);
//		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
//		Statement statement=connection.createStatement();
//		int result=statement.executeUpdate(input);
//		
//		if(result==1)
//		{
//			jutil.printStatement("data insert in database successfully");
//		}
//		}
//		
//		finally {
//				connection.close();
//			}
//		try {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		webDriverUtility.maximizeBrowser(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		driver.findElement(By.linkText("Projects")).click();
		List<WebElement> listOfProjects=driver.findElements(By.xpath("//tbody//tr//td[2]"));
		
		for(WebElement project:listOfProjects)
		{
		if(project.getText().equalsIgnoreCase(projectName))
		{
			jutil.printStatement("passed");
			jutil.printStatement("Project Name is visible in GUI");
			break;
		}
		}
		webDriverUtility.quitBrowser(driver);	
	}
}
