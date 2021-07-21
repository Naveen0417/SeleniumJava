package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.ilovepdf.com/");
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);					
		WebElement w = c.findElement(By.xpath("//span[text()=\"Convert PDF\"]"));
		Actions a = new Actions(c);
		a.moveToElement(w).build().perform();		

	}

}
