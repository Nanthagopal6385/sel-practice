package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver"
					 ,"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
					
					WebDriver driver =new ChromeDriver();
					
					driver.get("https://www.facebook.com/")	;				
					driver.manage().window().maximize();
					
					Thread.sleep(3000);
					
					WebElement email = driver.findElement(By.id("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/input"));
					email.sendKeys("nanthagopal35");
					
	}

}
