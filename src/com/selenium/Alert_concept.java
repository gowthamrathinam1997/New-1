package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	WebElement alert = driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]"));
	alert.click();
	
	Thread.sleep(3000);
	
	Alert simple_alert= driver.switchTo().alert();
	simple_alert.accept();
	
	WebElement comfirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	comfirm.click();
	
	WebElement c_alert = driver.findElement(By.xpath("//button[contains(text(),'confirm box' )]"));
	c_alert.click();
	
	Thread.sleep(2000);
	
	Alert confirm_alert = driver.switchTo().alert();
	confirm_alert.dismiss();
	
	WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	prompt.click();
	
	WebElement prompt_alert = driver.findElement(By.xpath("(//button[contains(text(),'click the button to')])[3]"));
	prompt_alert.click();
	
	Alert propt_ale = driver.switchTo().alert();
	propt_ale.sendKeys("hai gowtham");
	propt_ale.accept();
	}

}
