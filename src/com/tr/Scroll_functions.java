package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_functions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement backtotop = driver.findElement(By.xpath("//div[@class='navFooterBackToTopText']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", backtotop);
		
		//scroll up
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		//scroll down
		Thread.sleep(3000);
		
		js.executeScript("windoe.scrollBy(0,1000)");
		
		
		
		
		
	}

}
