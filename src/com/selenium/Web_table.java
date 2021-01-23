package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		//column_heade= //table/tbody/tr/th
		List<WebElement> column_header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement c_header : column_header) {
			String text = c_header.getText();
			System.out.println(text);
		}

		//row_datas= //table/tbody/tr[3]/td
		List<WebElement> row_datas = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (int i = 0; i < row_datas.size(); i++) {
			String text = row_datas.get(i).getText();
			System.out.println(text);
		}

		//column_datas= //table/tbody/tr/td[3]
		List<WebElement> column_datas = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (int i = 0; i < column_datas.size(); i++) {
			String text = column_datas.get(i).getText();
			System.out.println(text);
		}
		
		//particular_data= //table/tbody/tr[3]/td[3]
		WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
		String text = particular_data.getText();
		System.out.println(text);

		//all_header= th
		List<WebElement> all_header = driver.findElements(By.tagName("th"));
		for (int i = 0; i <all_header.size() ; i++) {
			String text2 = all_header.get(i).getText();
			System.out.println(text2);
		}
		
		
		List<WebElement> header = driver.findElements(By.tagName("//table/thead"));
		for (int i = 0; i <header.size() ; i++) {
			String text2 = header.get(i).getText();
			System.out.println(text2);
		}
		
	}
	
	
	
	
	
	
}