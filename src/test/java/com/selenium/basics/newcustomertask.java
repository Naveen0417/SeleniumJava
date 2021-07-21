
package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newcustomertask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://cdriver//chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		c.findElement(By.xpath("//input[@value=\"Add New Tasks\"]")).click();
		//Handling DropDown concept
		WebElement w = c.findElement(By.name("customerId")); 
        Select s = new Select(w);
        s.selectByVisibleText("-- new customer --"); 
		c.findElement(By.name("customerName")).sendKeys("money");
		c.findElement(By.name("projectName")).sendKeys("MarsMission");
		c.findElement(By.name("task[0].name")).sendKeys("Land-On-Mars");
		c.findElement(By.name("task[0].deadline")).sendKeys("27/12/2020");
		//Handling DropDown concept
		WebElement w1 = c.findElement(By.name("task[0].billingType")); 
        Select s1 = new Select(w1);
        s1.selectByValue("1"); 
        c.findElement(By.xpath("//input[@value=\"Create Tasks\"]")).click();
        Thread.sleep(3000);
        //Handling Alert() Pop-up concept
        c.findElement(By.xpath("//a[text()=\"delete\"]")).click();
        c.switchTo().alert().dismiss();// for cancel
        c.findElement(By.xpath("//a[text()=\"delete\"]")).click();
        c.switchTo().alert().accept();// for accept
		System.out.println("title page is" + c.getTitle());

	}

}
