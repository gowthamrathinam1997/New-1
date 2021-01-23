package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_project\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_EAIaIQobChMIxZL5wOrW7QIVSzErCh0BQAKzEAAYASAAEgJY9fD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIxZL5wOrW7QIVSzErCh0BQAKzEAAYASAAEgJY9fD_BwE%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		d.manage().window().maximize();

		WebElement email = d.findElement(By.id("ap_email"));
		email.sendKeys("gowtham@gmail.com");

		WebElement login_btn = d.findElement(By.id("continue"));
		login_btn.click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Vanitha\\Desktop\\gowtham\\Selenium_practice\\snap\\snap\\png");
		FileUtils.copyFile(source, destination);
		

		d.quit();

}}
