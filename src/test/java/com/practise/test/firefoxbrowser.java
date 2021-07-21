package com.practise.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxbrowser {
	public static void main(String arg[])
	{
		System.setProperty("webdriver.gecko.driver","E:\\cdriver\\geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		f.get("http://127.0.0.1:81/login.do");
		f.close();
	}
	

}
