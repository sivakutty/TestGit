package com.SeleniumPro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser 
{
	static Scanner sr=new Scanner(System.in);
	public void chromecall() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com");
		String s=chrome.getTitle();
		System.out.println("The Title is:"+s);
		chrome.manage().window().maximize();
	//	Thread.sleep(50000);
		
		WebElement create=chrome.findElement(By.linkText("Create New Account"));
		create.click();
		Thread.sleep(50000);
		WebElement fname=chrome.findElement(By.name("firstname"));
		fname.sendKeys("Siva");
		WebElement lname=chrome.findElement(By.name("lastname"));
		lname.sendKeys("Sankar");
		WebElement mbl=chrome.findElement(By.name("reg_email__"));
		mbl.sendKeys("8220748429");
		WebElement npass=chrome.findElement(By.name("reg_passwd__"));
		npass.sendKeys("Test@123");
		WebElement butt=chrome.findElement(By.name("websubmit"));
		butt.click();
		
		
		
		
		
		
		
		
		//chrome.quit();
		
		
		
	}
	
	public void firefoxcall()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver firefox=new FirefoxDriver();
		firefox.get("https://www.instagram.com");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		browser br=new browser();

		System.out.println("Press 1 For Chrome\nPress 2 For Firefox\nPress 0 For Exit");
		int a=sr.nextInt();
		
		switch(a)
		{
			case 1:
			{
				br.chromecall();
				break;
				
			}
			case 2:
			{
				br.firefoxcall();
				break;
				
			}
			default:
			{
				System.out.println("Exit");
				break;
			}
		}
				


	}
	

}
//set la oru value mattum edukanum