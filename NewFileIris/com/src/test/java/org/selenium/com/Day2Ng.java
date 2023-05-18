package org.selenium.com;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2Ng {
	
	public static WebDriver driver;
	
  @BeforeMethod
  public void Launch() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/automation-practice-form");
	  
  }
  

//  @Test(priority=1)
//  public void f() {
//	  
//  }
  
  @Test
  public void f2() throws InterruptedException {
	  WebElement fname = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
	
	  if(fname.isDisplayed() == true)
	  driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("saurav");
	  else
		  System.out.println("first anme is not displayed");
	  
	  WebElement lname = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	 
	  if(lname.isDisplayed() == true)
	  driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("sagar");
	  else
		  System.out.println("last name is not displayed");
	  WebElement em = driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	  if(em.isDisplayed()==true)
	  driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("saurav@gmail.com");
	  else
		  System.out.println("email is not displayed");
	  
	  
	  driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("9876543210");
	  
	  String s = "9876543210";
	  Assert.assertEquals(s, "9876543210","Number does not matched");	
	  
	  Actions gen = new Actions(driver);
	  gen.click(driver.findElement(By.xpath("//label[text()='Male']"))).perform();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	  
  }
  
  

  @AfterMethod
  public  void CloseBrowser() {
	  driver.close();
  }
}
