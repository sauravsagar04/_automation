package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentChildAncestor {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/guru99home/");
		  
	  }
  @Test
  public void f() {
	 
	  driver.findElement(By.xpath("(//div[@class=\"canvas-middle\"])[7]/ancestor::div[@class=\"rt-grid-12 rt-alpha rt-omega\"]/child::h2"));
  }
}
