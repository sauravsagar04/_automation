package org.selenium.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurav Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		WebDriverWait w = new WebDriverWait(driver, 20);
//		driver.get("https://demoqa.com/automation-practice-form"); 
		
		
//		driver.get("https://www.tothenew.com/");
		
//		System.out.println(driver.getTitle());
//		driver.findElement(By.id("firstName")).sendKeys("saurav");
		
//		WebElement fname = driver.findElement(By.xpath("//input[@id=\\\"firstName\\\"]"));
//		w.until(ExpectedConditions.visibilityOf(fname));
//		fname.sendKeys("saurav");
		
//		driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("saurav");
		
//		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("saurav");
//		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("sagar");
//		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("saurav@gmail.com");
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
//		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
		
		
//		driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("9876543210");
		
		
//		driver.findElement(By.xpath("//div[@id=\"subjectsContainer\"]")).sendKeys("hello");
//		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		
		
//		driver.findElement(By.xpath("//label[text()='Sports']")).click();
//		driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("noida sector 37");
		
		
//		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("saurav@gmail.com");
		
//		driver.findElement(By.xpath("//a[@id=\"h-contact-us\"]")).submit();	
		
//		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5,TimeUnit.SECONDS).ignoring(ElementClickInterceptedException.class);
//		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(ElementClickInterceptedException.class);
		
		driver.get("https://demoqa.com/alerts");
		WebElement d = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		d.click();
		Alert a = driver.switchTo().alert();
		
		
		
		
		
		
		
		
//		
		
		
		

	}

}
