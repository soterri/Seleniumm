package WebElementCommandsRadioButtonsCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) {
		
		/*navigate to facebook
		 * click on forgot links
		 * navigate to facebook again
		 * navigate forward
		 * navigate back
		 * refresh the page
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		//navigate
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

		driver.close();
	}
}
