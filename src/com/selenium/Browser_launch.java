package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\geckodriver.exe" );
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");

		d.manage().window().maximize();
		
		String title = d.getTitle();
		System.out.println(title);
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		d.navigate().to("https://www.google.com/search?q=flipkart&oq=flipkart&aqs=chrome..69i57j0i433j0j0i433l3j0j5.6481j0j7&sourceid=chrome&ie=UTF-8");
		
		d.navigate().back();
		
		d.navigate().forward();
		
		d.navigate().refresh();
		
		d.close();
		
		d.quit();
		
		
	}
	
	
	
}
