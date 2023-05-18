package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDowns {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  
	  }
  @Test
  public void f() throws InterruptedException {
	  
	  //clicking on the oneway radio button
	  driver.findElement(By.xpath("//label[text()=\"Round Trip\"]")).click();
	  Thread.sleep(2000);
	  
	  //selecting the source and destination from the drop down option
	  driver.findElement(By.xpath("//span[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
	  driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).sendKeys("Delhi (DEL)");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).sendKeys("Mumbai (BOM)");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//a[text()=\"25\"])[1]")).click();
	  Thread.sleep(1000); 
	  
	  //selecting the depart date and return date
	  driver.findElement(By.xpath("(//input[@id=\"ctl00_mainContent_view_date2\"])[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("(//a[text()=\"25\"])[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[@id=\"hrefIncChd\"]")).click();
	  Thread.sleep(1000);
	  
	  
	  //selecting the currency type
	  WebElement curr =  driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
	  Select s = new Select(curr);
	  s.selectByValue("USD");
	 
	  //clicking on the search button
	  driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
	  Thread.sleep(5000); 
  }
  
  
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
