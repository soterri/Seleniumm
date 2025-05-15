package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");

		WebElement userName = driver.findElement(By.id("identifierId"));
		userName.sendKeys("thach.sotheary@gmail.com");

		driver.findElement(By.id("identifierNext")).click(); 

		driver.findElement(By.name("Passwd"));

	}
}
