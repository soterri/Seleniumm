package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class DashboardPageElement {
	
	@FindBy(id="welcome")
	public WebElement welcomeDisplay;
	
	public DashboardPageElement(){
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
