package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLoginUsingXpath {
	public static void main(String[] args) {

		/*
		 * TEST CASE: navigate to
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login enter
		 * username and pwd click login button click on pim link click on add employee
		 * link enter employee values and click save
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on PIM and add employee
		//LINK ALWAYS STARTS WITH <a (anchor)
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Add Emp')]")).click();
		
		//using xpath enter in the textbox field (firstname, lastname, etc)
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Terri");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Thach"); //to enter lastName
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
