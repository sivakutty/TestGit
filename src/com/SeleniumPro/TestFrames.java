package com.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFrames {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/nykaa-naturals-face-wash/p/863854?productId=863854&pps=1&skuId=793901");
		//driver.manage().window().maximize();
//		WebElement listbox = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
//		Select list=new Select(listbox);
//		list.selectByValue("6");

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		System.out.println("Frame Displayed: "+frame.isEnabled());

		Thread.sleep(10000);
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//p[@data-test-id='select-quantity']")).click();
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		System.out.println("done");
		
		
		
		
		
	
	}
	
	
	

}
