package com.SeleniumPro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeTable {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/table");
WebElement firsttable = driver.findElement(By.xpath("//table"));
	System.out.println("firsttable DATA\n"+firsttable.getText());

	
	List<WebElement> checkboxtable = driver.findElements(By.xpath("(//table)[2]"));
	for (WebElement single : checkboxtable) {
		
		if(single.getText().equals("Raj"))
		{
			System.out.println(single.getText());
			break;
		}
		
	}

		
		
	
	}

	
	
	
	
}
