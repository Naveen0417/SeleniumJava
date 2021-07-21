package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		c.findElement(By.xpath("//a[text()=\"Projects & Customers\"]")).click();
		Thread.sleep(2000);
		//Get Text
		String s= c.findElement(By.xpath("//a[text()=\"Projects & Customers\"]")).getText();	
		System.out.println("The text is:"+s);
		Thread.sleep(2000);
		//Get Attribute
		Thread.sleep(2000);
		String s1= c.findElement(By.xpath("//input[@value=\"Add New Customer\"]")).getAttribute("value");	
		System.out.println("The text is:"+s1);
		
		

	}
}
