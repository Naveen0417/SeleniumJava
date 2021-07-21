package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copypaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		c.findElement(By.xpath("//a[text()=\"Users\"]")).click();
		c.findElement(By.xpath("//input[@type=\"button\"]")).click();
		//Copy Text
		WebElement copy = c.findElement(By.name("username"));
		copy.sendKeys("Naveen");
		Actions builder = new Actions(c);
		builder.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		builder.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		//Paste	Text	
	    c.findElement(By.name("firstName")).click();
		builder.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();

	}

}
