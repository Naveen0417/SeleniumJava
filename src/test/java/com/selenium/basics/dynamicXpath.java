package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dynamicXpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		c.findElement(By.xpath("//a[text()=\"Projects & Customers\"]")).click();
		c.findElement(By.xpath("//input[@value=\"Add New Customer\"]")).click();
		
		c.findElement(By.name("name")).sendKeys("Mars");
		c.findElement(By.name("createCustomerSubmit")).click();
//		public void dropdown() {
//		String name = c.findElement(By.xpath("//*[contains(text(),'"+name+"')]")).click();
//		}
}
}