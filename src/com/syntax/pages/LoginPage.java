package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonnMethods;

public class LoginPage extends CommonnMethods {

	//storing elements into respective class
	
	//creating a repository of our WebElements, the goal is create storing all elements
	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("loginBtn"));
	
	
	
}
