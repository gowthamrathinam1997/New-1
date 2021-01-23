package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_action {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).build().perform();
			 		
		WebElement soft = driver.findElement(By.xpath("//a[text()='PHP Training ']"));
		a.moveToElement(soft).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement mysql = driver.findElement(By.xpath("//a[text()='MySQL Training']"));
		a.moveToElement(mysql).build().perform();
		a.click(mysql).build().perform();
		
		
		
	}
}
