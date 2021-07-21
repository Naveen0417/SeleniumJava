package com.practise.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.opentelemetry.trace.Event;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		EventFiringWebDriver e=new EventFiringWebDriver(c);
		File sourceLocation=e.getScreenshotAs(OutputType.FILE);
		File destinationLocation=new File("E:\\Test_screenshots\\file1.jpg");
		FileUtils.moveFile(sourceLocation, destinationLocation);
		c.close();
	}
		
		

	

}
