package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	  public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	    public static void main(String[] args) throws InterruptedException {

	        // Set path to ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

	        // Create WebDriver instance
	        WebDriver driver = new ChromeDriver();

	        // Maximize browser window (optional)
	        driver.manage().window().maximize();

	        // Open the URL
	        driver.get(url);

	        // Wait for page to load completely (better to use WebDriverWait, using sleep here for simplicity)
	        Thread.sleep(2000);

	        // Enter username
	        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

	        // Enter password
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	        // Click the Login button
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        // Optional: wait to observe the login
	        Thread.sleep(3000);

	        // Close the browser
	        driver.quit();
	    }
	}
				//input[@type='text']
				//form[starts-with(@action,'/humanresource')]
				//h1[text()='A place where knowledge becomes a creer']
				//h1[contains(text(),'Syntax')]
				//input[@type='hidden' and @name='actionID']
				//input[@type='hidden' or @name='actionID']
	

	