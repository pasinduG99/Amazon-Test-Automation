package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tablets");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Select checkbox Samsung
		WebElement Samsung = driver.findElement(By.xpath("//li[@id='p_89/SAMSUNG']//i[@class='a-icon a-icon-checkbox']"));
		Thread.sleep(3000);
		Samsung.click();
		
		//select $25 to $50
		WebElement range = driver.findElement(By.xpath("//span[contains(text(),'$25 to $50')]"));
		Thread.sleep(3000);
		range.click();
		
		//select an item
		WebElement Tab = driver.findElement(By.linkText("SAMSUNG Tab A7 Lite Bookcover Dark Gray"));
		Thread.sleep(3000);
		Tab.click();
		
		//Add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//Go to Cart
		driver.findElement(By.xpath("//a[normalize-space()='Go to Cart']")).click();
		
		//Change quantity
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		
		//Change quantity to 2
		driver.findElement(By.xpath("//a[@id='quantity_2']")).click();
		
		//Verify  the url
		String act_url = driver.getCurrentUrl();
		System.out.println(act_url);
				
		//verify 
		String desired_url = "https://www.amazon.com/gp/cart/view.html?ref_=sw_gtc";
		if(act_url.equals(desired_url))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
				
		//close the browser
		driver.close();
		
		
		

	}

}
