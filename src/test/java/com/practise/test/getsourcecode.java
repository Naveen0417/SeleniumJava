package com.practise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsourcecode {

	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		//Thread.sleep(3000);

		driver.findElement(By.linkText("Reports")).click();
//		String f=driver.getPageSource();
//		System.out.println(f);
		System.out.println(driver.getPageSource());
		close();


	}
	
	public static void close() {
		driver.findElement(By.className("logoutImg")).click();
		driver.close();
	}

}
