package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3Selenium {
	public static WebDriver driver;
	
	  @BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.tothenew.com/");
		  
	  }
  @Test
  public void t() {
	  
	  JavascriptExecutor a = (JavascriptExecutor)driver;
	  a.executeScript("window.scrollBy(0,500)");
	  WebElement address1 = driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]"));
	  address1.click();
  }
}
