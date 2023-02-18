package com.SeleniumPro;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NykaaComplete {


	public static WebDriver driver;

	public static void brandSelect() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\SeleniumProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		
		driver.findElement(By.xpath("//a[@href='/?root=logo']")).click();
		
		driver.manage().window().maximize();
		String homeurl = driver.getCurrentUrl();
		WebElement skinlabel = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/nb-popup-homepage/popup-homepage']"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(skinlabel).perform();
		WebElement comp = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/gadgets-tech-accessories/computer-peripherals/c/16947']"));
		mouse.moveToElement(comp).click().perform();


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


		driver.findElement(By.xpath("//div[text()='SanDisk Ultra Dual Drive Go Type C Pendrive for Mobile 64GB,...']")).click();
		//
		
		
		String creamselection=driver.getCurrentUrl();
		Set<String> all = driver.getWindowHandles();
		//		Iterator<String> iterator2 = all.iterator();
		for (String string : all) {
			driver.switchTo().window(string);
			if(!driver.getCurrentUrl().equals(creamselection)&&!driver.getCurrentUrl().equals(homeurl))

			{
				driver.switchTo().window(string);
				break;
			}

		}

//		WebElement listbox = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
//		Select list=new Select(listbox);
//		list.selectByValue("6");

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();

		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		
		driver.navigate().refresh();

		
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		System.out.println("Frame Displayed: "+frame.isEnabled());

		Thread.sleep(8000);
		driver.switchTo().frame(frame);

	//	driver.findElement(By.xpath("//p[@data-test-id='select-quantity']")).click();
		
		//driver.findElement(By.xpath("(//li[@class='css-18fuhjc edkwwn3'])[2]")).click();;

		
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		
		
		
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		
		
		Thread.sleep(3000);
		//WebElement address = driver.findElement(By.xpath("//div[@class='css-47fhk7 e1iuq4410']"));
		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		Actions addres=new Actions(driver);
		addres.moveToElement(address).perform();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("627859",Keys.TAB );
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']")).sendKeys("123XX",Keys.TAB );
		
		
		
		driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']")).sendKeys("XXX Road",Keys.TAB );
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Siva",Keys.TAB );
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8220748429",Keys.TAB );
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("test@gmai.com",Keys.TAB );
		driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
		
		Thread.sleep(40000);
		driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("1234567891234567");
		driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']")).sendKeys("0326");
		driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("123");
		String text = driver.findElement(By.xpath("//p[@class='css-1apuje1 eka6zu20']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']")).click();
		
		
		System.out.println("done");




	









	}






	public static void main(String[] args) throws InterruptedException {


		brandSelect();
		System.out.println("done");

	}	




}
