package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_absolute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=ad43b6d9-a845-4500-8460-ffe83e5b554c");

		WebElement oppo_c3 = driver.findElement(By
				.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div/div/div/div/img"));
		oppo_c3.click();
	}
}
