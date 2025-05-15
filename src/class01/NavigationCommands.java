package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title matches");
		} else {
			System.err.println("The actual and expected title do not match");
		}
		
		System.out.println("----------------");
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl = "https://www.google.com/";
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("both URL matched");
		}else {
			System.err.println("Actual and expected does not match");
		}
		driver.close();
	}

}
