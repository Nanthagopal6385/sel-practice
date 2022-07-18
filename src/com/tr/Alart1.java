package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement simple = driver.findElement(By.xpath("//button[@'btn btn-danger']"));
		simple.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("//a[@class'analystic])[2]"));
		confirm.click();
		
		driver.switchTo().alert().dismiss();
	}

}
