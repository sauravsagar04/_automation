package comQKart;



import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register {
	public static WebDriver driver;
	@BeforeClass
	public void Launch() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://crio-qkart-frontend-qa.vercel.app/");	  
		  Thread.sleep(3000);
		  
	  }
  @Test(priority=0)
  public void homepagelogo() {
	  WebElement homepge = driver.findElement(By.xpath("//img[@src=\"logo_light.svg\"]"));
	  if(homepge.isDisplayed() !=true)
		  System.out.println("Home logo is not displayed");
		  
  }
  
  @Test(priority=1)
  public void searchbox() {
	  WebElement searchbox = driver.findElement(By.xpath("(//input[@placeholder=\"Search for items/categories\"])[1]"));
	  Assert.assertTrue(searchbox.isDisplayed(), "search Box is not dispalyed");
  }
  
  @Parameters(value = "browser")
  @Test(priority = 2)
  public void addtocart(String a) throws InterruptedException {
	  WebElement addToCart = driver.findElement(By.xpath("(//button[@type=\"button\"])[1]"));
	  addToCart.click();
	  Thread.sleep(1500);
	  String s = driver.findElement(By.xpath("//div[@id=\"notistack-snackbar\"]")).getText();
	  Assert.assertEquals(s, "Login to add an item to the Cart");
	  
	  Thread.sleep(5000);
  }
  @Test(priority= 3)
  public void isRegisterButtonEnabled() throws InterruptedException {
	  WebElement btn = driver.findElement(By.xpath("//button[text()=\"Register\"]"));
	  btn.click();
	  Thread.sleep(3000);
	  String s = driver.getCurrentUrl();
	  Assert.assertEquals(s, "https://crio-qkart-frontend-qa.vercel.app/register");
	  driver.navigate().back();
	  Thread.sleep(3000);
	   
  }
  @AfterClass
  public  void CloseBrowser() {
	  driver.quit();
  }
}
