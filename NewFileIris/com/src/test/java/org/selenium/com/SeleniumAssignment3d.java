package org.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment3d {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar"
		  		+ "\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.tothenew.com/");
		  
	  }
  @Test
  public void scrollingFunction() throws InterruptedException {
	  JavascriptExecutor j = (JavascriptExecutor) driver;
	  //This will scroll down to 700 pixel
	  j.executeScript("window.scrollBy(0,700)"); 
	  Thread.sleep(3000);
	  //This will scroll down to bottom of the page
	  j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(3000);
  }
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
