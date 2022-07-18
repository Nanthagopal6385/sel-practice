package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;

public class webelement_method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nandhagopal35@");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("lingesh");
		
		String attribute = password.getAttribute("type");
		System.out.println(attribute);
		
		WebElement login = driver.findElement(By.name("login"));
		 //login.click();
		
		String text = login.getText();
		System.out.println(text);
		
		email.clear();
		password.clear();
	}

}
