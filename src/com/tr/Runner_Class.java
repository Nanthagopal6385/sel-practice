package com.tr;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class Runner_Class  {
	
	  
	  
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver"
				 ,"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\driver\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				Thread.sleep(3000);
				driver.get("http://automationpractice.com/index.php");				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				WebElement findElement = driver.findElement(By.id("sigin"));
				WebElement name = driver.findElement(By.id("email"));
				name.sendKeys("nandhagopal23@gmail.com");
				WebElement pass = driver.findElement(By.id("passwd"));
				pass.sendKeys("nandha@123");
				WebElement login = driver.findElement(By.id("SubmitLogin"));
				login.click();
			
				WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
				Actions ac=new Actions(driver);
			    ac.moveToElement(dress).build().perform();
				Thread.sleep(2000);
				WebElement evening = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
				evening.click();
				WebElement print = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
				print.click();
				Thread.sleep(2000);
			
				WebElement frame = driver.findElement(By.xpath("//iframe"));
				driver.switchTo().frame(frame);
				WebElement qua = driver.findElement(By.xpath("//i[@class='icon-plus']"));
				qua.click();
				WebElement size = driver.findElement(By.name("group_1"));
				Select s=new Select(size);
				s.selectByIndex(2);
				
				WebElement colour = driver.findElement(By.id("color_24"));
				colour.click();
				WebElement submit = driver.findElement(By.name("Submit"));
				submit.click();
				driver.switchTo().defaultContent();
				
				Thread.sleep(2000);
				
				WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
				proceed.click();
				
				WebElement checkout = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
				checkout.click();
				
				WebElement add = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
				add.click();
				Thread.sleep(2000);
				WebElement radio = driver.findElement(By.id("cgv"));
				radio.click();
				Thread.sleep(5000);
				
				WebElement shipping = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				shipping.click();
				WebElement pay = driver.findElement(By.className("bankwire"));
				pay.click();
				WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
				confirm.click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300);");
				
				Thread.sleep(2000);
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\Screenshot\\Mini_Projectimage.png");
			FileUtils.copyFile(source, des);
				
			
	}
}
