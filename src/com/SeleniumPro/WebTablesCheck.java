package com.SeleniumPro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesCheck {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("GAINERS/LOSERS Table All Data");

		List<WebElement> loserData = driver.findElements(By.xpath("(//table)[1]"));
		for (WebElement SingleData : loserData) {
			System.out.println(SingleData.getText());
		}



		



		System.out.println(" process done");

		
		
//		
//		System.out.println("\n MOST ACTIVE Table All Data");
//		driver.findElement(By.xpath("//a[text()='MOST ACTIVE ']")).click();
//		WebElement activeData = driver.findElement(By.xpath("(//table)[3]"));
//		System.out.println(activeData.getText());
//
//
//		
//		
//		
//
		System.out.println("\n----Get EICHERMOT Data-----");
		String data="EICHERMOT";

		List<WebElement> alldata = driver.findElements(By.xpath("(//table)[1]"));
		for (WebElement singleData : alldata) {
			if(singleData.getText().equals(data))
			{	
				System.out.println(singleData.getText());
			}
		}


	}
}
