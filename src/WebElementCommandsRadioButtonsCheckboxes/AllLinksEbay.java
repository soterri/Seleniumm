package WebElementCommandsRadioButtonsCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksEbay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println(allLinks.size());

		int count = 0;

		for (WebElement links : allLinks) {
			String text = links.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;

			}
		}
		System.out.println("Total # of links with text is "+count);
		driver.quit();
	}

}
