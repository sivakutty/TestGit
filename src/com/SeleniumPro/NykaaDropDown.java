package com.SeleniumPro;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NykaaDropDown {


	public static WebDriver chrome;
	public static void productselect() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");			
		chrome=new ChromeDriver();
		chrome.get("https://www.nykaa.com");
		chrome.manage().window().maximize();
		Thread.sleep(3000);
		WebElement skin = chrome.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/skin-native-desktop/skin']"));
		WebElement facecream = chrome.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[2]/ul/li/div/div[1]/div/ul[2]/li[1]/a"));

		//		WebElement skin = chrome.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[2]/a"));
		//		WebElement facecream = chrome.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[2]/ul/li/div/div[1]/div/ul[2]/li[1]/a"));
		Actions cat=new Actions(chrome);
		cat.moveToElement(skin).moveToElement(facecream).click().perform();

		Thread.sleep(3000);
		Set<String> allwin = chrome.getWindowHandles();

		Iterator<String> iterator = allwin.iterator();
		while(iterator.hasNext())
		{
			String child_window=iterator.next();
			if(!iterator.equals(child_window))
			{
				chrome.switchTo().window(child_window);
			}
		}

		chrome.findElement(By.xpath("//*[text()='Nykaa Naturals Face Wash']")).click();;
		//neem.click();
		String tit = chrome.getCurrentUrl();
		System.out.println(tit);
		String product = chrome.getWindowHandle();
		Set<String> windowHandles = chrome.getWindowHandles();
		Iterator<String> tabswitch = windowHandles.iterator();
		for (String string : windowHandles) {
			tabswitch.hasNext();
			String switchtab = tabswitch.next();
			if(!string.equals(windowHandles))
			{
				chrome.switchTo().window(switchtab);
			}

		}

		WebElement checkbox = chrome.findElement(By.xpath("//select[@title='SHADE']"));

		Select selectcheckbox=new Select(checkbox);
		selectcheckbox.selectByIndex(7);
		WebElement firstSelectedOption = selectcheckbox.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		WebElement addtobag = chrome.findElement(By.xpath("//span[text()='Add to Bag']"));
		addtobag.click();
		

	}

	public static void sign() throws InterruptedException {

		String currentUrl = chrome.getCurrentUrl();
		System.out.println(currentUrl);
		chrome.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div/button")).click();
		
//		WebElement findElement = chrome.findElement(By.xpath("//button[text()='Sign in']"));
//		findElement.click();
		WebElement signbutton = chrome.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		
		
		signbutton.click();
		System.out.println(chrome.getCurrentUrl());
		//chrome.findElement(By.xpath("//input[@placeholder='Enter Email ID or Phone Number']")).click();
		String mail="test@123.com";
		Thread.sleep(5000);
		System.out.println(chrome.getCurrentUrl());
		chrome.findElement(By.xpath("//input[@placeholder='Enter Email ID or Phone Number']")).sendKeys(mail);
		chrome.findElement(By.id("submitVerification")).click();
		chrome.findElement(By.id("userName")).sendKeys("Siva");
		chrome.findElement(By.xpath("//input[@placeholder='Phone Number ']")).sendKeys("9876543210");
		chrome.findElement(By.xpath("input[@placeholder='Create Password']")).sendKeys("password@123");
		chrome.findElement(By.xpath("//button[text()='register']")).click();
		//
		System.out.println("Register Done");



	}




	public static void main(String[] args) throws InterruptedException {
		
		productselect();
		//sign();
		//login();

	}



}
