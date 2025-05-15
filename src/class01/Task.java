package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		
		/*1.open chrome browser
		 *2. go to amazon.com
		 *3.verify title
		 */
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title matches");
		}else {
			System.out.println("Title does not match");
		}
		driver.close();
	}

}
