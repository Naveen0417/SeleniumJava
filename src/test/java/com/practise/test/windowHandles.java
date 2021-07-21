package com.practise.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		c.findElement(By.xpath("//input[@value=\"Add New Tasks\"]")).click();
		List<WebElement> f = c.findElements(By.xpath("//input[@type=\"text\"]"));
		f.get(4).sendKeys("venky");
	
		List<WebElement> f1 = c.findElements(By.xpath("//img[@alt=\"Click Here to Pick up the timestamp\"]"));
		f1.get(1).click();
		
		// main window
		String main = c.getWindowHandle();
		
		Set<String > child = c.getWindowHandles();
		
		for(String s : child) {
			if(!s.equals(main)){
				c.switchTo().window(s);
				break;
			}
		}
	
	//	c.switchTo().window("http://127.0.0.1:81/calendar.do?yearFrom=2003&yearTo=2022&selectDate=SmartDate_updateDateFieldFromCalendar&dateStr=2021-2-22");
	    c.findElement(By.xpath("//span[text()=\"24\"]")).click();
	    System.out.println("iam in child window");
	    c.switchTo().window(main);
	    System.out.println("iam in main window");
	    
	    c.close();
	}

}
