package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "E://cdriver//geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://www.demo.guru99.com/v4/");
		d.findElement(By.name("uid")).sendKeys("mngr305336");
		d.findElement(By.name("password")).sendKeys("sAdamAt");
		d.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		d.close();
	}

}
