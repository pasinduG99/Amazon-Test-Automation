package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

		
		
		//Test Search Bar
		Select selectelement = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		selectelement.selectByValue("search-alias=electronics-intl-ship");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Navigate backward
		driver.navigate().back();
		
		//Test sidemenu
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[8]/a[1]/i[1]")).click();
		driver.findElement(By.linkText("Laptop Accessories")).click();
		
		
		//Test Customer Service
		driver.findElement(By.xpath("//div[@id='nav-main']//a[2]")).click();
		
		
		
		

	}

}
