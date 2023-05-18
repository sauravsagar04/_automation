package org.selenium.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurav Sagar\\Downloads"
				+ "\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
	  }
  @Test(priority=0)
  public void alertGetText() {
	  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	  String s = driver.switchTo().alert().getText();
	  System.out.println(s);  
  }
  
  @Test(priority=1)
  public void alertDismiss() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	  System.out.println();
	  
  }
  
  @Test(priority=2)
  public void alertInput() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("saurav");
	  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	  Thread.sleep(3000);
	 
  }
  
  @Test(priority=3)
  public void alertAccept() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("saurav");
	  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
  }
  
  @AfterMethod
  public  void CloseBrowser() {
	  driver.quit();
  }
}
