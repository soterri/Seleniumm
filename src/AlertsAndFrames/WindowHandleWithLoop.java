package AlertsAndFrames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String signUpTitle = driver.getTitle();
		System.out.println("New page title is: "+signUpTitle);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
		
		for(int i=1; i<=3; i++	) {
			driver.findElement(By.cssSelector("button[id='tabButton']"));
			Thread.sleep(2000);
		}
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle:allWindowHandles) {
			System.out.println("ID of the Window "+handle );
			driver.switchTo().window(handle);
			driver.get("https://www.google.com");
		}
		driver.close();
	}

}
