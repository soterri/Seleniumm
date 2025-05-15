package WebElementCommandsRadioButtonsCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	public static String userName="thach22204@gmail.com";
	public static String password = "Boolean1234!";
			

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen(); // can also do method maximize();

		driver.get("https://www.facebook.com");

		WebElement userNametxt = driver.findElement(By.cssSelector("input[id*='email']"));
		userNametxt.sendKeys(userName);

		// storing password text box inside variable
		WebElement passWord = driver.findElement(By.cssSelector("input[id*='pass']"));
		passWord.sendKeys(password);
		Thread.sleep(2000);

		//verify if logo is displayed
		boolean isDisplayed = driver.findElement(By.xpath("//img[contains(@class, 'fb_logo')]")).isDisplayed();

		if (isDisplayed) {
			System.out.println("FB logo is displayed");
		} else {
			System.out.println("FB logo is not displayed");
		}
		
		// click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);


		driver.quit();
	}

}