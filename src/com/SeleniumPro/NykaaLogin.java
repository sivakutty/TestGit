package com.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykaaLogin {
	public static WebDriver chrome;
	
	public static void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");			
		chrome=new ChromeDriver();
		chrome.get("https://www.nykaa.com");
		chrome.manage().window().maximize();
		chrome.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		chrome.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
		System.out.println(chrome.getCurrentUrl());
		
		Thread.sleep(3000);
		chrome.findElement(By.name("emailMobile")).sendKeys("jevod50953@webonoid.com");
		chrome.findElement(By.id("submitVerification")).click();
		System.out.println(chrome.getCurrentUrl());
		Thread.sleep(20000);
		System.out.println(chrome.getCurrentUrl());
		chrome.findElement(By.id("userName")).sendKeys("Siva");
		chrome.findElement(By.name("phoneNumber")).sendKeys("8220748429");
		chrome.findElement(By.name("password")).sendKeys("Siva@123");
		chrome.findElement(By.xpath("//button[text()='register']")).click();
		chrome.findElement(By.xpath("//button[text()='register']")).click();
	

	}

	public static void main(String[] args) throws InterruptedException {
		register();
		
	}
}
