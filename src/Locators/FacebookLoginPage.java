package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //invoke browser by creating an obj of chrome driver class and refer to interface webdriver
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("thach22204@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Boolean1234!");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		//driver.close();
	}

}
