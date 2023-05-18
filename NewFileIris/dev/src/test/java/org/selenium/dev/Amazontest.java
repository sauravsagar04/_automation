package org.selenium.dev;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazontest {
	public static WebDriver driver;
	@BeforeMethod
	  public void Launch() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav Sagar"
		  		+ "\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  
	  }
	@Test(priority=0)
	  public void testHomePage() {
		  String expectedTitle = "Amazon";
		  String actualTitle = driver.getTitle();
		  System.out.println(actualTitle);
		// asserting that title contains amazon
		  Assert.assertTrue(actualTitle.contains(expectedTitle)); 
		  
		  String expectedURL = "https://www.amazon.in/";
		  String actualURL = driver.getCurrentUrl();
		  System.out.println(actualURL);
		  // asserting that we land on right url
		  Assert.assertTrue(actualURL.contains(expectedURL)); 
		  // assert that main logo is dsiplayed
		  Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed()); 
	  }
	  
	  @Test(priority=1)
	  public void testSearchPage() {
		    String searchTerm = "macbook";
		    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		    searchBox.sendKeys(searchTerm);
		    searchBox.submit();
		    
		    String expected = "RESULTS";
		    String actual = driver.findElement(By.xpath("//span[text()=\"RESULTS\"]")).getText();
		    System.out.println(actual);
		    // asserting that result page is shwoing a heading 'RESULTS'
		    Assert.assertEquals(actual.toUpperCase(), expected); 
		  }

	  
	  @Test(priority=2)
	  public void testCart() throws InterruptedException{
		  WebElement cartbutton = driver.findElement(By.id("nav-cart-count-container"));
		  cartbutton.click();
		  String expectedURL = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
		  String actualURL = driver.getCurrentUrl();
		  System.out.println(actualURL);
		  // asserting that we land on right url 
		  Assert.assertTrue(actualURL.contains(expectedURL)); 
		  String expectedmessage = "Your Amazon Cart is empty";
		  String actualmessage = driver.findElement(By.xpath(""
		  		+ "//div[@class=\"a-row sc-your-amazon-cart-is-empty\"]")).getText();
		  // asserting that before adding anything cart is empty
		  Assert.assertEquals(actualmessage, expectedmessage);
		  driver.navigate().back(); // back to homepage
		  String searchTerm = "macbook";
		  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		  searchBox.sendKeys(searchTerm);
		  searchBox.submit();
		  driver.findElement(By.xpath("//h2[1]//a[1]")).click();
		  Set<String> allhandles = driver.getWindowHandles();
		  //switching to the new tab
		  driver.switchTo().window(allhandles.stream().toList().get(1)); 
		  driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
		  Set<String> s = driver.getWindowHandles();
		  System.out.println(s);
		  driver.switchTo().window(s.stream().toList().get(1));
		  String expectedmessage1 = "Added to Cart";
		  Thread.sleep(5000);
		  String actualmessage1 = driver.findElement(By.xpath(""
		  		+ "//div[@id='attachDisplayAddBaseAlert']")).getText();
		  System.out.println(actualmessage1);
		  // asserting that item is added message is there
		  Assert.assertEquals(actualmessage1, expectedmessage1);
		  // going back to cart
		 driver.findElement(By.xpath("//span[@id=\"attach-sidesheet-view-cart-button\"]")).click();
		  // assert that there are some items in cart
		  Assert.assertTrue(driver.findElement(By.xpath(""
		  		+ "(//div[@class=\"a-row sc-cart-header sc-compact-bottom\"])")).isDisplayed()); 
		  
		  Thread.sleep(10000);
	  }
		  @AfterMethod
		  public  void CloseBrowser() {
			  driver.quit();
		  }
}
