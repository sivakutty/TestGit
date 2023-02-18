package com.SeleniumPro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.xml.ws.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	static Scanner sr=new Scanner(System.in);

	public static void create() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");//session--> driver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Processing.....");
		driver.get("https://www.youtube.com/channel/UCt4c264m2oxwbKYKJXULb6g");


		for(int i=0;i<=200;i++)
		{

			//			Actions action=new Actions(driver);
			//			action.contextClick(jvtab).perform();
			//			Robot rbt=new Robot();
			//			rbt.keyPress(KeyEvent.VK_DOWN);
			//			rbt.keyPress(KeyEvent.VK_ENTER);
			//			Thread.sleep(8000);

			//		WebElement jvtab=driver.findElement(By.xpath("//*[contains(text(),'New Year Celebration in Fun World‼️Fun wid Famly#tamil #bangalore #newyear2023 @jeevasopinion7813')]"));
			WebElement jvtab=driver.findElement(By.xpath("//*[contains(text(),'Nadar song   selvin nadar songs   ')]"));
			jvtab.click();
			Thread.sleep(30000);
			//String link=driver.getCurrentUrl();
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println(i);


		}
		WebElement jvtab=driver.findElement(By.xpath("//*[contains(text(),'Nadar song   selvin nadar songs   ')]"));
		jvtab.click();
		Thread.sleep(90000);
		driver.quit();





		System.out.println("process done done");	

	}

	public static void main(String[] args) throws InterruptedException, AWTException{

		create();

	}



}
