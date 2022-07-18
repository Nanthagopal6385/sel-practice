package com.tr;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\Screenshot\\nandha.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
	}

}
