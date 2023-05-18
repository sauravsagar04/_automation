package q11.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11c {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String w=driver.findElement(By.xpath("//h1")).getText();
		Thread.sleep(5000);
		if(w.contentEquals("Automation Demo Site")) {
			 System.out.println("Valid header");
		}
		else {
			 System.out.println("Invalid header");
		}
		driver.close();

	}

}
