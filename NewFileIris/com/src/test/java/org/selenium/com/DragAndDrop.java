package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/droppable");
		  
	  }
  @Test
  public void dragAnddrop() throws InterruptedException {
	  WebElement drg = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	  WebElement drp = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	  
	  Actions ac = new Actions(driver);
	  ac.dragAndDrop(drg, drp).build().perform();
	  Thread.sleep(3000);
  }
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
