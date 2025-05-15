package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLoginCssSelector {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login into OrangeHRM
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[class='button']")).click();
		
		//2 way
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); //looking at tag name, inside tag there will be id and id will have value of txtusername
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123"); //#hashtag use when using id 
		
		
		driver.findElement(By.cssSelector("input.button")).click(); //when using class - using . 
		
	}

}


