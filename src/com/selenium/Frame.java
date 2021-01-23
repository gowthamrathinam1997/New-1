package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement frame_Txt = driver.findElement(By.xpath("//input[@type='text']"));
		frame_Txt.sendKeys("hai");
		driver.switchTo().defaultContent();
		
		WebElement click = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click.click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		Thread.sleep(3000);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		WebElement inner1 = driver.findElement(By.xpath("//input[@type='text']"));
		inner1.sendKeys("gowtham");
		driver.switchTo().defaultContent();
		
		WebElement click1 = driver.findElement(By.xpath("//a[text()='Video']"));
		click1.click();
	}
}
