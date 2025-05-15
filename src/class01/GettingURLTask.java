package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingURLTask {
	public static void main(String[] args) {
		
//		String actualUrl=driver.getCurrentUrl();
//		System.out.println(actualUrl);
//		
//		String expectedUrl = "https://www.google.com/";
//		
//		if(expectedUrl.equals(actualUrl)) {
//			System.out.println("both URL matched");
//		}else {
//			System.err.println("Actual and expected does not match");
//		}
		
		/*
		 * open chrome browser
		 * navigate to google.com
		 * than navigate to gmail.com
		 * navigate back to google.com
		 * refresh current page
		 * verify url contains google
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().back();

		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String expectedUrl = "https://www.google.com/";
		
		//driver.navigate().refresh();

		if(currentUrl.equals(expectedUrl)) {
			System.out.println("contains google");
		}else {
			System.out.println("does not match");
		}
		driver.close();
		
	}

}
