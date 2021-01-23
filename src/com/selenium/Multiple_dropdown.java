package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		WebElement muliplevalue = driver.findElement(By.name("States"));
		Select s = new Select(muliplevalue);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		List<WebElement> options = s.getOptions();
		int allvalue = options.size();
		System.out.println("size : " + allvalue);

		for (int i = 0; i < allvalue; i++) {

			if (i == 2 || i == 3 || i == 5) {
				s.selectByIndex(i);

			}
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		for (WebElement webElement : options) {
			String text2 = webElement.getText();
			System.out.println(text2);

		}
	}
}
