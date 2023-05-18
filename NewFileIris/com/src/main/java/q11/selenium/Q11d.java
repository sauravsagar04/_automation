package q11.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11d {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		if(driver.getTitle().contentEquals("Register")) {
			System.out.println("Valid Tile");
		}
		else {
			System.out.println("Invalid Title");
		}
		driver.close();

	}

}
