package com.selenium.basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
	ChromeDriver c = new ChromeDriver();
	c.get("http://127.0.0.1:81/login.do");
 	String parentWindowHandle = c.getWindowHandle();
 	System.out.println("Parent window's handle -> " + parentWindowHandle);
	c.findElement(By.name("username")).sendKeys("admin");
	c.findElement(By.name("pwd")).sendKeys("manager");
	c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
 	Thread.sleep(3000);//to pause for some time
 	c.findElement(By.linkText("Reports")).click();
 	Thread.sleep(2000);
 	List<WebElement> a = c.findElements(By.xpath("//img[@src=\"/img/default/calendar/cal.gif\"]"));
 	a.get(0).click(); 
 	
    Set<String> allwindows = c.getWindowHandles();
    for(String S: allwindows) {
    	if(!S.equals(parentWindowHandle)) {
    		c.switchTo().window(S);
    		break;
    	  }
    	}
    List<WebElement> b = c.findElements(By.xpath("//span[text()=\"3\"]"));
 	b.get(0).click();
 	c.switchTo().window(parentWindowHandle);
 	
 	// c.close();
    }
}  
   
 	
 	
 	
 