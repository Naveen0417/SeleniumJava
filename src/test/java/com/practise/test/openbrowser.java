package com.practise.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\cdriver\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://127.0.0.1:81/login.do");
		c.close();
	}

}
