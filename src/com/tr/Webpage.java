package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage { 
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nadha");
	
	driver.findElement(By.id("pass")).sendKeys("thyagi");
	
	
	}
	
	
	
	

}
