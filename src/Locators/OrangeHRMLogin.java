package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
	
	public static void main(String[] args) {
		
		/*TEST CASE:
		 * navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 * enter username and pwd
		 * click login button
		 * click on pim link
		 * click on add employee link
		 * enter employee values
		 * and click save
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("//input[@name='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("add Emp")).click();
		
		
		
	}
	

}
