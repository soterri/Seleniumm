package WebElementCommandsRadioButtonsCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		String userName = "";
		String password = "";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//login into application
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		//logo verification
				boolean isDisplayed=driver.findElement(By.cssSelector("div[class*='login']")).isDisplayed();
				
				if(isDisplayed) {
					System.out.println("Logo is displayed");
				}else {
					System.out.println("Logo is not displayed");
				}
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//verify product text
		WebElement product = driver.findElement(By.xpath("//span[@class='title']"));
		boolean displayP = product.isDisplayed();
		String productText = product.getText();
		
		String expectedText = "PRODUCTS";
		
		if(displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("element is not displayed");
		}
		
	}
}
