package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q2 {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  
	  }
  @Test(priority=0)
  public void radioOneWay() throws InterruptedException {
	 
	  driver.findElement(By.xpath("//label[text()='One Way']")).click();
	  Thread.sleep(2000);
	  
  }
  @Test(priority=1)
  public void radioRoundTrip() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
	  Thread.sleep(2000);
	  
  }
  @Test(priority=2)
  public void radioMulticity() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
	  Actions ac = new Actions(driver);
	  Thread.sleep(3000);
	  
	  ac.moveToElement(driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']"))).click().perform();
	
	  Thread.sleep(10000);
  }
  
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
