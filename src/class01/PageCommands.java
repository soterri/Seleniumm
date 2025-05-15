package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) throws InterruptedException {

		// System is a class - setProperty is a static method
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//browser navigation commands
		driver.navigate().to("https://www.gmail.com"); //will navigate to give url
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		driver.close();
		
		

	}
	

}
