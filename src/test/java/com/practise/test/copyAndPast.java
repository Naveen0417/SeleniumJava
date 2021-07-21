package com.practise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class copyAndPast {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
			ChromeDriver c = new ChromeDriver();
			c.get("http://127.0.0.1:81/login.do");
			c.findElement(By.name("username")).sendKeys("admin");
			c.findElement(By.name("pwd")).sendKeys("manager");
			c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			Thread.sleep(3000);
			c.findElement(By.linkText("Users")).click();
			c.findElement(By.xpath("//input [@value=\"Add New User\"]")).click();
//			//line for entering the data
//			c.findElement(By.name("username")).sendKeys("naveen");
//			//line for copying the data
//			c.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+"c");
//			//line for pasting the data
//			c.findElement(By.name("firstName")).sendKeys(Keys.CONTROL+"v");
			
			WebElement copy = c.findElement(By.name("username"));
			copy.sendKeys("Naveen");
			Actions paste =  new Actions(c);
			paste.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			paste.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			c.findElement(By.name("firstName")).click();
			paste.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			
			


	}

}
