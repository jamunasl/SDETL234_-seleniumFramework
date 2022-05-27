package com.rmgyantra.projectTest;

import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.sdet34l1.genericlibrary.DataBaseUtility;
import com.sdet34l1.genericlibrary.FileUtility;
import com.sdet34l1.genericlibrary.IconstantPath;
import com.sdet34l1.genericlibrary.JavaUtility;
import com.sdet34l1.genericlibrary.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProjectTest 
{
	public static void main(String[] args) throws SQLException, IOException, InterruptedException 
	{
		
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		JavaUtility jutil = new JavaUtility();
		WebDriverUtility webDriverUtility= new WebDriverUtility();
		FileUtility fileUtility = new FileUtility();
		int randomnumber = jutil.getRandomNumber(1000);
		String actual="TestYantra"+randomnumber;
		driver=new ChromeDriver();
		webDriverUtility.maximizeBrowser(driver);
		driver.get("http://localhost:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys(actual);
		driver.findElement(By.name("createdBy")).sendKeys("vigesh");
		WebElement dropdown=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("On Goging");
		driver.findElement(By.cssSelector("[value='Add Project']")).click();
		//String expected=driver.findElement(By.className("table-hover")).getText();
		
		
		fileUtility.openPropertyFile(IconstantPath.RMGYANTRA_PROPERTIYFILE_PATH);
		DataBaseUtility.openDBConnection(IconstantPath.DATABASEURL+fileUtility.getDataFromPropertyFile("DBName"),fileUtility.getDataFromPropertyFile("DBUsername"),fileUtility.getDataFromPropertyFile("DBPassword"));
		boolean status = DataBaseUtility.validateDataInDatabase("Select project_name from project;","project_name","projects");
		if(status == true)
		{
			jutil.printStatement("Tc Pass");
		}
		else
		{
			jutil.printStatement("Tc fail");
		}
		DataBaseUtility.closeDBConnection();
//		Driver driver1=new Driver();
//		DriverManager.registerDriver(driver1);
//		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
//		Statement statement=connection.createStatement();
//		ResultSet result=statement.executeQuery("select project_name from project;");
//		while(result.next())
//		{
//			String s1=(result.getString(4));
//			if(s1.equals(actual))
//			{
//			jutil.printStatement("Project name is present in the database :"+actual);
//			}
//		}
//		connection.close();
		webDriverUtility.quitBrowser(driver);	
	}
}
