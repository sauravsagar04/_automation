package comQKart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelEdge {
	public static WebDriver driver;
	@BeforeMethod
	  public void edgeLaunch() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Saurav Sagar\\"
				+ "Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();	  
	}  
  @Test
  public void openGoogle() {
	  driver.get("https://www.google.com/"); 
  }
  @AfterMethod
  public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
  }
}
