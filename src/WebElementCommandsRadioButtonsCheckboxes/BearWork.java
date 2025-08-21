package WebElementCommandsRadioButtonsCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BearWork {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
	
	public static String userName="Tester";
	public static String passWord="test";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement user = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
		user.sendKeys(userName);

		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys(passWord);

		WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.click(); // changed from submit() to click()

		// Wait for page to load after login
		Thread.sleep(2000);

		// Check if "Web Orders" header is displayed
		boolean isDisplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		System.out.println(isDisplayed);

		if (isDisplayed) {
			System.out.println("Test case passes");
		} else {
			System.out.println("Test case does not pass");
		}

		WebElement loginInfo = driver.findElement(By.xpath("//div[@class='login_info'"));
		String text = loginInfo.getText();
		
		if(text.contains("Tester")) {
			System.out.println("User successfully logged in, test case passed");
		}else {
			System.out.println("User is not logged in, test case failed");
			
		}
		
	}
}
