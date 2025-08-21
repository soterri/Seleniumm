package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonnMethods;
import com.utils.ConfigsReader;

public class LoginTest extends CommonnMethods {

	public static void main(String[] args) {

		/*
		 * USER STORY as an admin user should be able to login with valid credentials
		 */
		
		//opening browser and navigating to url
		setUp();//url is the Syntax demo page which I don't have access to
		
		WebElement userName = driver.findElement(By.xpath("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		//sending password
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		sendText(passWord, ConfigsReader.getProperty("password"));
		
	}

}
