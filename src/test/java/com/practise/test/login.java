package com.practise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class login {
public static void main(String args[]) throws Exception
{
//	System.setProperty("webdriver.chrome.driver","E:\\cdriver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.google.com");
	c.findElement(By.name("username")).sendKeys("admin");
	c.findElement(By.name("pwd")).sendKeys("manager");
	c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	c.findElement(By.className("logoutImg")).click();
	
	
	
}
}
