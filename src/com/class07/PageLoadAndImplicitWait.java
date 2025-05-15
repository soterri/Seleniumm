package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PageLoadAndImplicitWait extends CommonMethods{
	
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", "https://www.google.com/");
		
		/*
		 * page load waits until all elements on the page gets fully loaded
		 * if element does not load within 30 seconds you will get TimeOutException
		 */
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		/*tell webDriver to wait for the element before throwing NoSuchElementException
		 * we need implicit wait
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("wronggg")).sendKeys("iPhone");
		
		//driver.quit();
		
		
	}

}
