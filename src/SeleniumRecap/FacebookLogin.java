package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("thach22204@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Boolean1234!");
		
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.close();
		
	}

}
