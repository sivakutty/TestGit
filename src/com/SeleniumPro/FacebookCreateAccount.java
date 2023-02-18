package com.SeleniumPro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAccount {
	static Scanner sr=new Scanner(System.in);

	public static void create() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");//session--> driver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Processing.....");
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		System.out.println("Login page Ignored");
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href='/apple-iphone-13-pro-max-sierra-blue-128-gb/p/itm5ede69d71530a']")).click();
		String title=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println("Press 1 for exit");
		int i=sr.nextInt();

		if(i==1)
		{
			driver.quit();
		}



	}

	public static void main(String[] args) throws InterruptedException{

		create();

	}



}
