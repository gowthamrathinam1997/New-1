package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//  get=launch the particular url	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

//  x path=  //tagname[@attributename='attributevalue']
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abc@gmail.com");

		WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]"));
		findElement2.sendKeys("123456");

//  x path=  //tagname[contains(text(),'partialtext')]
		WebElement facebook_Txt = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = facebook_Txt.getText();
		System.out.println(text);

//  x path=  //[text()='full text']
		WebElement creat_Txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text2 = creat_Txt.getText();
		System.out.println(text2);

//  x path=  (//tagname[@attributename='attributevalue'])[index]
		WebElement login_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		login_Btn.click();

	}

}
