package com.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestAlertFunction extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	 	
		CommonMethods.setUp("chrome", "syntax site that doesnt work anymore");
		driver.findElement(By.xpath("")).click();
		
		String alertText=getAlertText();
		System.out.println(alertText);
		//^^^ ENHANCED CODE from CommonMethods below code
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
		
		acceptAlert();
		
		
		//alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
