package comQKart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelFirefox {
	public static WebDriver driver;
	@BeforeTest
	 public void firefoxLaunch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\"
				+ "Saurav Sagar\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		  driver.manage().window().maximize(); 
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}
	@Test
	public void openTTn() {
		driver.get("https://en.wikipedia.org/wiki/Mahatma_Gandhi");
	}
	@AfterTest
    public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
    }
}
