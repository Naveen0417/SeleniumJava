package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageactions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		c.findElement(By.linkText("Reports")).click();
		c.navigate().back();    // TO Navigate Back to previous page
		c.navigate().forward(); // TO Navigate Forward to previous page
		c.navigate().refresh(); // to refresh the current page
		System.out.println("title page is"+ c.getTitle());

	}

}
