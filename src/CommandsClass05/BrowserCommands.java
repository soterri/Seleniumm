package CommandsClass05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) {
		
		String fbUrl = "https://www.facebook.com";
		String googleUrl = "https://google.com";
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(fbUrl);
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to(googleUrl);
		String currUrl =driver.getCurrentUrl();
		System.out.println(currUrl);
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		
	}

}
