package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement_methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gamil.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("asd");
		
		boolean enabled = email.isEnabled();
		System.out.println(enabled);
		
		boolean enabled2 = password.isEnabled();
		System.out.println(enabled2);
		email.clear();
		password.clear();
		
		email.sendKeys("hai@gamil.com");
		password.sendKeys("asdfghj");
		
		String attribute = email.getAttribute("value");
		System.out.println(attribute);
		
		String attribute1 = password.getAttribute("value");
		System.out.println(attribute1);
		
		String attribute_name = password.getAttribute("id");
		System.out.println(attribute_name);
		
		String attribute_name1 = password.getAttribute("name");
		System.out.println(attribute_name1);
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		WebElement get_Txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = get_Txt.getText();
		System.out.println(text);
		
		WebElement click = driver.findElement(By.xpath("//a[@role='button']"));
		click.click();
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.name("sex"));
		Select s = new Select(gender);
		s.selectByVisibleText("Female");
		
		boolean selected = gender.isSelected();
		System.out.println(selected);
	}
}
