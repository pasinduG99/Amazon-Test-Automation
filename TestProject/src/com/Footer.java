package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sell products on Amazon']")).click();
		
		driver.getWindowHandle();
		
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();

		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;

		//Click the link which opens in a new window
		driver.findElement(By.xpath("//img[@alt='Twitter logo']")).click();
		
		//Switch back to the old tab 
		driver.switchTo().window(originalWindow);
		
		//close window
		driver.close();

	}

}
