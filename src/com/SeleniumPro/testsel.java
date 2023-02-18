package com.SeleniumPro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsel {
	
	public static void sel()
	{
		System.setProperty("webdriver.chrom.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://google.com");
		
		
		
		
		
		
	}

	
	public static void main(String[] args) {
		sel();
		
	}
}
