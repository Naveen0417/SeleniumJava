package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		Thread.sleep(3000);
		driver.findElement(By.name("uid")).sendKeys("mngr305336");
		driver.findElement(By.name("password")).sendKeys("sAdamAt");
		driver.findElement(By.xpath("//input[@value=\"RESET\"]")).click();
		Thread.sleep(3000);
		System.out.println("reset button clicked");
		driver.findElement(By.name("uid")).sendKeys("mngr305336");
		driver.findElement(By.name("password")).sendKeys("sAdamAt");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.close();
	}
}
