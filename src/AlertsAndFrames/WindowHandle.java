package AlertsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("");
		
		driver.findElement(By.linkText("Sign Up")).click();

		String signUpTitle = driver.getTitle();
		System.out.println(signUpTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);//getting the handle of parent window
		String childWindow = driver.getWindowHandle();
		System.out.println(childWindow);

		Set<String> allWindowHandles = driver.getWindowHandles();

		Iterator<String> it = allWindowHandles.iterator();
		while (it.hasNext()) {
			String handle = it.next();

			if (!handle.equals(parentwindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();

			}

		}

		

	}

}
