package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class LoginPageElements {
	
	//simply locating elements, supports all 8 locators
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement buttonLogin;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	//creating a constructor of this page
	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);//this refers to current class and object
		
	}

}

//@FindBy we just locationg elements, once we locate elements we initialize all these elements at once 
//instead of saying driver.findelement this and that, we use 
//pagefactory methods initElements, these methods initialize all objects of the current page
/*
 * page factory eliminates the driver.findelements/element we are initaliing all elements of THIS page locating elements using @Findby annotation
*/