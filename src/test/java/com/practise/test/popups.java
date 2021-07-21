package com.practise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		c.findElement(By.xpath("//a[text()=\"Projects & Customers\"]")).click();
		c.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c.findElement(By.name("name")).sendKeys("naveen");
		c.findElement(By.linkText("Users")).click();
		c.findElement(By.id("RemainOnThePageButton")).click();
		c.findElement(By.xpath("//input[@value=\"      Cancel      \"]")).click();
		
		String f = c.switchTo().alert().getText();
		System.out.println(f);
		
		c.switchTo().alert().dismiss();
		c.findElement(By.xpath("//input[@value=\"      Cancel      \"]")).click();
		c.switchTo().alert().accept();
		c.close();

	}
}
