package com.tr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.type.TypeList.Generic.ForDetachedTypes;

public class alart {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> all_data = (List<WebElement>) driver.findElement(By.xpath("//tale[@id='table_id']/tbody/tr/td"));
		
		for (WebElement webElement : all_data) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
            System.out.println("======Row Data=====");
		
		
		List<WebElement> row_Data = (List<WebElement>) driver.findElement(By.xpath("//tale[@id='table_id']/tbody/tr[3]/td"));
		
		
		for(WebElement row :row_Data) {
			String text1 = row.getText();
			System.out.println(text1);
		}
		
		System.out.println();
		
		
	}

}
