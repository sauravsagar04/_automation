package q11.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11b {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement w=driver.findElement(By.xpath("//input[@name='radiooptions']"));
		Thread.sleep(5000);
		w.click();
		Thread.sleep(5000);
		Boolean b = w.isSelected();
		System.out.println(b);
		driver.close();
	}

}
