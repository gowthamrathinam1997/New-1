package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");

		d.manage().window().maximize();


		WebElement word = d.findElement(By.xpath("(//a[@href='contact.php'])[1]"));
		word.click();

		WebElement findElement2 = d.findElement(By.xpath("//input[@placeholder='Name']"));
		findElement2.sendKeys("gowtham");

		WebElement findElement3 = d.findElement(By.xpath("//input[@placeholder='Email']"));
		findElement3.sendKeys("gowthamrathinam@gmail.com");

		WebElement findElement4 = d.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		findElement4.sendKeys("8973361685");

		WebElement findElement5 = d.findElement(By.xpath("(//select[@name='courses'])[1]"));
		findElement5.sendKeys("selenium");

		WebElement findElement6 = d.findElement(By.xpath("(//select[@name='branch'])[1]"));
		findElement6.sendKeys("porur");

		WebElement findElement7 = d.findElement(By.xpath("(//select[@name='time'])[1]"));
		findElement7.sendKeys("at 9 oclock");

		WebElement findElement8 = d.findElement(By.xpath("//textarea[@class='form-control input-message']"));
		findElement8.sendKeys("hai");

		WebElement findElement9 = d.findElement(
				By.xpath("//button[contains(@class,'button btn-lg btn-theme full-rounded animated right-icn')]"));
		findElement9.click();

	}
}
