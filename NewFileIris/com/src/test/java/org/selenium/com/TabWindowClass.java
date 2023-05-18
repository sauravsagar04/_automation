package org.selenium.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TabWindowClass {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/browser-windows");
		  
	  }
	  @Test
	  public void tabhandle() {
		  driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();  
		  Set<String> thandle = driver.getWindowHandles();
		  driver.switchTo().window(thandle.stream().toList().get(1));
		  String t = driver.findElement(By.id("sampleHeading")).getText();
//		  Assert.assertEquals(t, "This is a sample page");
		  Assert.assertEquals(t, "This is a sample page");
		  
	  }	  
	  @Test(enabled=false)
	  public void windowhandle() {
		  driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		  String whandle = driver.getWindowHandle();
		  System.out.println(whandle);
		  Set<String> allhandles = driver.getWindowHandles();
		  System.out.println(allhandles);
		  driver.switchTo().window(allhandles.stream().toList().get(1));
		  String w = driver.findElement(By.id("sampleHeading")).getText();
		  Assert.assertEquals(w, "This is a sample page");
		  
				  
	  }
	  @AfterMethod
	  public  void CloseBrowser() {
		  driver.quit();
	  }
}
