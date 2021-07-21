package com.practise.test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static WebDriver c;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		c.findElement(By.xpath("//input[@value=\"Add New Tasks\"]")).click();
		usage();

	}

	public static void usage() {
		List<WebElement> f = c.findElements(By.xpath("//input[@type=\"text\"]"));
		f.get(5).sendKeys("venky");
		// c.close();
	}
}
