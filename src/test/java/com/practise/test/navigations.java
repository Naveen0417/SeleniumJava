package com.practise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {

	public static WebDriver c;

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		Thread.sleep(3000);

		c.findElement(By.linkText("Reports")).click();
		back();
		forward();
		refresh();
		close();

	}

	public static void forward() {

		c.navigate().forward();
	}

	public static void back() {

		c.navigate().back();
	}

	public static void refresh() {
		c.navigate().refresh();
	}

	public static void close() {

		c.findElement(By.className("logoutImg")).click();
		c.close();
	}
}
