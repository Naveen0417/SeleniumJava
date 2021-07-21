package com.practise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\cdriver\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		WebElement dropdown =c.findElement(By.name("customerProject.shownCustomer"));
		Select d=new Select(dropdown);
    //  d.selectByVisibleText("deepu");
		d.selectByIndex(1);
		d.selectByValue("1");
		
		
	}

}
