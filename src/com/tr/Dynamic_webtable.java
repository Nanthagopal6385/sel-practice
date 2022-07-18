package com.tr;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {
	public WebDriver driver;
	static int indexofCountry;
	static int indexofTotalCases;
	static int indexofTotalRecoverd;
	static int indexofActiveCases;
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,
             "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     
		
		
	
		List<WebElement> allRowsHeaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

         for (int i = 0; i < allRowsHeaders.size(); i++) {
        	 
        	 String Title = allRowsHeaders.get(i).getText().replace("\n", " ");
        	 System.out.println(Title);
			
		if (Title.equalsIgnoreCase("TotalCases")) {
			
			indexofTotalCases = i;
			
		} else if (Title.equalsIgnoreCase("TotalRecoverd")) {
			
			indexofTotalRecoverd = i;
			
		}else if (Title.equalsIgnoreCase("ActiveCases")) {
			indexofActiveCases = i;
			
		}else if (Title.equalsIgnoreCase("Country")) {
			indexofCountry = i;
			
		}
			
		
			System.out.println("Index of Totalcase : " + indexofTotalCases);
			System.out.println("IndexofTotalRecoverd : " + indexofTotalRecoverd);
			System.out.println("IndexofActiveCases : " + indexofActiveCases);
			System.out.println("IndexofCountry : " + indexofCountry);
		}
         
         List<WebElement> allRows = driver
        		 .findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
         
		for (int i = 0; i < allRows.size(); i++) {
			
			allRows.get(i).findElements(By.xpath("td[" + indexofCountry +"]"));
			for (int j = 0; j <allRows.size(); j++) {
				
				if (j == indexofCountry) {
					
					
					}
						
						
					}
					
				}
				
			}
		
		
		
			
		
         
	
	   
        	 
			
		
			
		
			
		

	}	 
		
	


