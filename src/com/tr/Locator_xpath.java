package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Nanthagopal0");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("linga");
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("andhu");
		
	}

}
