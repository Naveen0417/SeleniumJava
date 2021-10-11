package com.selenium.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AscendingOrderSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver c= new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.get("https://www.saucedemo.com/");
		c.findElement(By.id("user-name")).sendKeys("standard_user");
		c.findElement(By.name("password")).sendKeys("secret_sauce");
		c.findElement(By.name("login-button")).click();
		
		List<WebElement> Beforesorting = c.findElements(By.className("inventory_item_price"));
		
		List<Double> BeforeSortingList = new ArrayList<Double>();
		
		for (WebElement p : Beforesorting) {
			BeforeSortingList.add(Double.valueOf(p.getText().replace("$", "")));
			System.out.println(BeforeSortingList);
		}
		Select dropdown = new Select(c.findElement(By.className("product_sort_container")));
		dropdown.selectByVisibleText("Price (low to high)");
		
		
		List<WebElement> Aftersorting = c.findElements(By.className("inventory_item_price"));
		List<Double> AfterSortingList = new ArrayList<Double>();
		
		for (WebElement p : Aftersorting) {
			AfterSortingList.add(Double.valueOf(p.getText().replace("$", "")));
			System.out.println(AfterSortingList);
		}
		Collections.sort(BeforeSortingList);
		Assert.assertEquals(BeforeSortingList, AfterSortingList);
		
		
		c.quit();
	}

}
