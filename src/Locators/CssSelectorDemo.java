package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("button[type^='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.quit();
		
		
		
	}

}
