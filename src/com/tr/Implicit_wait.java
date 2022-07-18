package com.tr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {
	
	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver"
		 ,"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nanthagopal35@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("lingesh");
		
		
		WebDriverWait Wait = new WebDriverWait(driver,30);
		
		Wait.until(ExpectedConditions.visibilityOf(password));
		
		
	}
}
