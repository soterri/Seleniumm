package com.utils;

import org.openqa.selenium.WebElement;

public class CommonnMethods extends BaseClass{

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
}
