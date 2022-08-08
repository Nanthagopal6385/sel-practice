package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelbookingpractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\chromedriver1\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("Nandhagopal23");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("KQM3CZ");
		
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		WebElement drp1 = driver.findElement(By.name("location"));
		Select s=new Select(drp1);
		
		s.selectByIndex(3);
		
		
		WebElement site = driver.findElement(By.id("hotels"));
		Select drop =new Select(site);
		drop.selectByValue("Hotel Sunshine");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select drop2 =new Select(type);
		drop2.selectByValue("Standard");
		
		
		WebElement num = driver.findElement(By.id("room_nos"));
		Select drop3 = new Select(num);
		drop3.selectByValue("2");
		
		WebElement room = driver.findElement(By.id("adult_room"));
		Select drop4 = new Select(room);
		drop4.selectByValue("3");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select drop5 =new Select(child);
		drop5.selectByValue("1");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		driver.findElement(By.id("radiobutton_0")).click();
		
		WebElement continues = driver.findElement(By.id("continue"));
		continues.click();
		
		WebElement name = driver.findElement(By.name("first_name"));
		name.sendKeys("nandha");
		
		WebElement last = driver.findElement(By.name("last_name"));
		last.sendKeys("gopal");
		
		WebElement adress = driver.findElement(By.name("address"));
		adress.sendKeys("braminar st chennai");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("12345");
		
		WebElement americka = driver.findElement(By.id("cc_type"));
		Select drop6 =new Select(americka);
		drop6.selectByValue("AMEX");
		
		WebElement dates = driver.findElement(By.id("cc_exp_month"));
		Select drop7 = new Select(dates);
		drop7.selectByValue("3");
		
		WebElement years = driver.findElement(By.id("cc_exp_year"));
		Select drop8 = new Select(years);
		drop8.selectByValue("2019");
		
		WebElement number = driver.findElement(By.id("cc_cvv"));
		number.sendKeys("0987654321");
		
		
		
		}

}
