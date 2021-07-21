package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class retriveurl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		c.findElement(By.linkText("Reports")).click();
		System.out.println("title page is " + c.getCurrentUrl());// get current URL
		c.navigate().back();
		System.out.println("title page is " + c.getPageSource());// get Source Page code
		c.close(); // TO close browser
	}

}
