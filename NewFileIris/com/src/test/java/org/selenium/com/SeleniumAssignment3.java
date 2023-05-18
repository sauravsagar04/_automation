package org.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment3 {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar"
		  		+ "\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://demo.automationtesting.in/Register.html");
		  
		  
	  }
  @Test
  public void formFill() throws InterruptedException {
	  //filling the name
	  driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("saurav");
	  driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("sagar");
	  
	  //Address input
	  driver.findElement(By.xpath("//textarea")).sendKeys("Noida sector 37");
	  
	  //email input
	  driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("saurav@gmail.com");
	  
	  //number input
	  driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9876543210");
	  
	  //clicking on the male radio button
	  driver.findElement(By.xpath("//label[text()=\" Male \"]")).click();
	  
	  //clicking in the cricket checkbox
	  driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
	  
	  //choosing english language
	  driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
	  driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
	  
	  
	  //selecting the skills
	  WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	  Select s = new Select(skills);
	  s.selectByVisibleText("Java");
	  
	  //selecting the country
	  WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
	  s = new Select(country);
	  s.selectByVisibleText("India");
	  
	  // selecting the date of birth
	  WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
	  s = new Select(year);
	  s.selectByVisibleText("2001");
	  WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	  s = new Select(month);
	  s.selectByVisibleText("January");
	  WebElement day = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
	  s = new Select(day);
	  s.selectByVisibleText("4");
	  
	  //password and confirm password input
	  driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("saurav@123");
	  driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("saurav@123");
	  
	  //clicking on the submit button
	  driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
	  
	  
	  Thread.sleep(6000);
  }
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
