package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_windows {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement gift = driver.findElement(By.xpath("(//a[@tabindex='0'])[8]"));
		Actions a = new Actions(driver);
		a.contextClick(gift).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		a.contextClick(mobile).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement today_deals = driver.findElement(By.linkText("Today's Deals"));
		a.contextClick(today_deals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement new_relese = driver.findElement(By.linkText("New Releases"));
		a.contextClick(new_relese).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String actual = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actual2="Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in";
		for (String id : all_id) {
			if (driver.switchTo().window(id).getTitle().equals(actual) || 
					driver.switchTo().window(id).getTitle().equals(actual2)) {
break;
			} else {
				driver.close();

			}

		}

	}
}
