package com.practise.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("https://www.ilovepdf.com/");
		WebElement f = c.findElement(By.xpath("//span[text()=\"Convert PDF\"]"));
		Actions g = new Actions(c);
		g.moveToElement(f).build().perform();
	}

}
