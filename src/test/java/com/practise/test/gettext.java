package com.practise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	public static WebDriver c;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
	    c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();

      //  Text();
        Attribute();

	}
	
	public static void Text() {
		String f1 = c.findElement(By.xpath("//span[text()=\"all active projects\"]")).getText();
		System.out.println(f1);
		c.close();
	}
	
	public static void Attribute() {
		String f = c.findElement(By.name("searchTasks")).getAttribute("value");
		System.out.println(f);
		c.close();
	}

}
