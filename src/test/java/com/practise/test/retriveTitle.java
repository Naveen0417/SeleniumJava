package com.practise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class retriveTitle {
public static void main(String args[]) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","E:\\cdriver\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://127.0.0.1:81/login.do");
	c.findElement(By.name("username")).sendKeys("admin");
	c.findElement(By.name("pwd")).sendKeys("manager");
	c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	String f=c.getTitle();
	System.out.println(f);
	Thread.sleep(3000);
	c.findElement(By.className("logoutImg")).click();
}
}