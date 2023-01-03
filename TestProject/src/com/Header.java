package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.navigate().to("https://www.amazon.com/");
		
		//Test Login
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.name("email")).sendKeys("pasinduclash74@gmail.com"); 
		
		driver.findElement(By.xpath("//input[@id='continue']")).click(); 
		
		driver.findElement(By.id("ap_password")).sendKeys("Casio10#");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); 
		
		

	}

}
