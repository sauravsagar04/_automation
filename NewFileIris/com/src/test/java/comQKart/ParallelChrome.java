package comQKart;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ParallelChrome {
	public static WebDriver driver;
	@BeforeTest
	  public void chromeLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\"
				+ "Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://en.wikipedia.org/wiki/Tim_Cook");
		  
	}  
	@Test
	public void test(String s) {
		List<WebElement> address1 = driver.findElements(By.xpath("//*[contains(text(),\"November 1, 1960\")]"));
		
		
		System.out.println(address1.size());
	}
	@Test
	public void test(int i) {
		
	}
	
	@AfterTest
    public void afterTest() {
	 driver.close();
    }
}
