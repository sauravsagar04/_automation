package org.selenium.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment3c {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar"
		  		+ "\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.path2usa.com/travel-companion/");
		  
	  }
	@Test
	public void fillForm() throws InterruptedException, AWTException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		 Thread.sleep(3000);
		 driver.findElement(By.name("form_fields[travel_from]")).sendKeys("DELHI");
		 driver.findElement(By.name("form_fields[travel_to]")).sendKeys("MUMBAI");
		 driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//span[text()='25']")).click();
		
		 Robot r = new Robot();
		 driver.findElement(By.name("form_fields[travel_comp_date_between]")).click();
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_ENTER);
		
		 Thread.sleep(3000);
		 driver.findElement(By.name("form_fields[travel_comp_airline]")).click();
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_ENTER);
		
		 Thread.sleep(2000);
		 driver.findElement(By.name("form_fields[travel_comp_language]")).click();
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_ENTER);
		
		 driver.findElement(By.xpath("//button[@class=\"elementor-button elementor-size-sm\"]")).click();
		
		 Thread.sleep(3500);
		 Assert.assertTrue(driver.findElement(By.xpath("//section[@data-id=\"fffcfcb\"]")).isDisplayed());
		
		 Thread.sleep(3500);
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		 try {
	FileUtils.copyFile(screenshotFile, new File("D:\\NewFileIris\\com\\src\\test\\java\\org"
			+ "\\selenium\\com\\PageScreenshot.png"));
	} catch (IOException e) {
	System.out.println(e.getMessage());
	}
	}

  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
