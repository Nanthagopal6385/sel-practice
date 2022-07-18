package com.tr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://meesho.com/tshirts-men/pl/t3brl");
		driver.manage().window().maximize();
		
		}
	
}
