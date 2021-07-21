package com.selenium.basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		//Screenshot for whole page
		EventFiringWebDriver e = new EventFiringWebDriver(c);
		File sourcelocation = e.getScreenshotAs(OutputType.FILE);
		File destinationlocation = new File("C:\\Users\\Admin\\Desktop\\rufus_files\\sample.jpg");
		FileUtils.moveFile(sourcelocation,destinationlocation);
		
	}

}
