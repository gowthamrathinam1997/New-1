package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dinamic_x_path {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.google.com/search?q=flipkart&oq=flipkart&aqs=chrome.0.69i59j69i60l3.4061j0j4&sourceid=chrome&ie=UTF-8");

		driver.manage().window().maximize();

		WebElement web = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));
		web.click();
		WebElement cook = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cook.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shirts");

		WebElement click_btn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		click_btn.click();
		
		Thread.sleep(3000);
		

		List<WebElement> allprize = driver
				.findElements(By.xpath("(//div[@class='_3I9_wc'])[1]//preceding-sibling::div[@class='_30jeq3']"));

		List<Integer> li = new ArrayList<Integer>();

		for (WebElement prizes : allprize) {
			String text = prizes.getText().substring(1).replace(",","");
			int value = Integer.parseInt(text);
			li.add(value);
		}
		int size = li.size();
		System.out.println(size);
		System.out.println("maximum value:" + Collections.max(li));

	}
}
