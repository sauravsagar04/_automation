package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/buttons");
		  
	  }
  @Test
  public void rightclick() throws InterruptedException {
	  WebElement rc = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
	  Actions ac = new Actions(driver);
	  ac.contextClick(rc).perform();
	  Thread.sleep(3000);
  }
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
