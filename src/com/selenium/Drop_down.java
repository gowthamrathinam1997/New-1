package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WebElement click_btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		click_btn.click();
		Thread.sleep(3000);
		
		WebElement first_name = driver.findElement(By.name("firstname"));
		first_name.sendKeys("gowtham");
		
		WebElement sec_name = driver.findElement(By.name("lastname"));
		sec_name.sendKeys("gow");
		
		WebElement moblie_no = driver.findElement(By.name("reg_email__"));
		moblie_no.sendKeys("8973362683");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("2546");
		
		//dropdown
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select se = new Select(date);
		se.selectByValue("20");

		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select se1 = new Select(month);
		se1.selectByIndex(1);

		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select se2 = new Select(year);
		se2.selectByIndex(24);

	}

}
