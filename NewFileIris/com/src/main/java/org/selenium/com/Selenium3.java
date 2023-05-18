package org.selenium.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Selenium3 {
	public static void main(String args[]) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurav Sagar\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurav Sagar\\Downloads\\"
//				+ "chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Saurav");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Sagar");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("Saurav@gmail.com");
		
		
		
		
//		driver.get("https://www.google.com/");
//		WebElement address = driver.findElement(By.xpath("//input[@class=\"gLFyf\"]"));
//		address.sendKeys("tothenew");
//		address.submit();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Saurav Sagar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		
//		driver.get("https://www.tothenew.com/");
//		WebElement address1 = driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]"));
//		address1.click();
		
//		driver.get("https://www.tothenew.com/");
//		WebElement address1 = driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]"));
//		address1.click();
//		System.out.println(driver.getTitle());
		
		
//		driver.get("https://www.tothenew.com/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		WebElement address1 = driver.findElement(By.id("h-contact-us"));
//		address1.click();
		
		
		
//		driver.get("https://www.tothenew.com/");
//		WebElement address1 = driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]"));
//		address1.click();
//		System.out.println(driver.getCurrentUrl());
		
		

		
		
		
		
		
		
		
		
	
	}

}
