package com.SeleniumPro;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		String homeurl = driver.getCurrentUrl();
		WebElement skinlabel = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/hair-republic-sale/hair-republic-sale']"));
		
		
		Actions mouse=new Actions(driver);
		mouse.moveToElement(skinlabel).perform();
		WebElement Shampoo = driver.findElement(By.linkText("Hair Oil"));
		mouse.moveToElement(Shampoo).click().perform();


		Set<String> twowindows = driver.getWindowHandles();
		//		Iterator<String> iterator = twowindows.iterator();
		for (String string : twowindows) 
		{
			driver.switchTo().window(string);

			if(!driver.getCurrentUrl().equals(homeurl))
			{
				driver.switchTo().window(string);
				break;
			}

			System.out.println(driver.getCurrentUrl());
		}

		
		List<WebElement> AllHairOil = driver.findElements(By.xpath("//div[@class='css-xrzmfa']"));
		for (WebElement SingleHaitOil : AllHairOil) {
			if(SingleHaitOil.getText().equals("Indulekha Bringha Hair Oil"))
			{
				SingleHaitOil.click();
			}
		}

	}

}
