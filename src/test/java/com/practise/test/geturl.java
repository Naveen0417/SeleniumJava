package com.practise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		Thread.sleep(3000);

		c.findElement(By.linkText("Reports")).click();
		String f=c.getCurrentUrl();
		System.out.println(f);
		
		c.findElement(By.className("logoutImg")).click();
		System.out.println("after logout the url is "+c.getCurrentUrl());
		c.close();

	}

}



