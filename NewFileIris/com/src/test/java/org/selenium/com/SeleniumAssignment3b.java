package org.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment3b {
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
  public void dropDownServiceVerify() throws InterruptedException {
	  Actions ac = new Actions(driver);
	  WebElement s = driver.findElement(By.xpath("(//a[@id=\"h-Services\"])[2]"));
	  ac.moveToElement(s).perform();
	  Thread.sleep(3000);
	  //storing the value in the string
	  String li = driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul)[2]")).getText();
	  Thread.sleep(2000);
	  
	  //verifying the services options using the string
	  Assert.assertTrue(li.contains("Digital Engineering"));
	  Assert.assertTrue(li.contains("Cloud & DevOps"));
	  Assert.assertTrue(li.contains("OTT Solutions & Services"));
	  Assert.assertTrue(li.contains("Data & Analytics"));
	  Assert.assertTrue(li.contains("CX, Content & Commerce"));
	  Assert.assertTrue(li.contains("Digital Marketing"));
	  
  }
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
