package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) throws InterruptedException {

		// Interface -WebDriver - parent for all classes that we have for browsers such
		// as ChromeDriver, SafariDriver, FireFoxDriver implements all browsers
		// Reference obj - Driver
		// need to import WebDriver/ChromeDriver bc its in a different package
		// setProperty - pass 2 keys

		// making connection to the driver by specifying path
		// setProperty the inside implementation makes a connection to chromedriver
		// once connection is made, opening chromebrowser ChromeDriver connection to
		// chromedriver - implements RemoteWebDriver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		// opening the browser by calling the constructor of chromeDriver class and
		// upcasting

		// Set the path to your ChromeDriver if needed:
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Open Google
		driver.get("https://www.google.com/");

		// Get current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);

		// Expected URL (fixed typo: too many 'w's and wrong casing)
		String expectedUrl = "https://www.google.com/";

		// Compare current and expected URLs (case-insensitive, ignore trailing slashes)
		if (currentUrl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();
			System.out.println("Page Title: " + title);
		} else {
			System.out.println("Wrong URL is returned");
		}

		// Navigate to Gmail
		driver.navigate().to("https://www.gmail.com");
		System.out.println("Navigated to: " + driver.getCurrentUrl());
		System.out.println("Gmail Page Title: " + driver.getTitle());

		// Close the browser
		driver.quit(); // Use quit() instead of close() to end the session fully
	}
}
