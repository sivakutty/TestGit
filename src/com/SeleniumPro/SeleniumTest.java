package com.SeleniumPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	private static void browserLaunch() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Chrome Driver\\chromedriver.exe");
		WebDriver a= new ChromeDriver();
		a.get("https://www.google.com");
		a.manage().window().maximize();
		Thread.sleep(3000);
		
		a.navigate().to("https://www.youtube.com");
		a.navigate().back();
		Thread.sleep(3000);
		
		a.navigate().forward();
		Thread.sleep(2000);
		a.navigate().refresh();
		
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch();
		

	}

}
