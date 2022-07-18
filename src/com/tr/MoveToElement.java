package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement courses = driver.findElement(By.xpath("//a[@class='btnMouse']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(courses).build().perform();
		
		WebElement selenium = driver.findElement(By.xpath("(//a[@class='listener'])[1]"));
		selenium.click();
		
		driver.switchTo().alert().accept();
		
	}

}
