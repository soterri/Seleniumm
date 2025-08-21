package WebElementCommandsRadioButtonsCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url = "https://demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize(); // maximize to avoid hidden elements

	        driver.get(url);
	        Thread.sleep(3000);

	        // Click the label for the Male radio button instead of the hidden input
	        WebElement genderLabel = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
	        genderLabel.click();

	        // After clicking the label, now verify the hidden input is selected
	        WebElement radioButton = driver.findElement(By.id("gender-radio-1"));
	        System.out.println("Is selected? " + radioButton.isSelected());

	        Thread.sleep(3000);
	        driver.quit();
	    }

	}
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get(url);
//		Thread.sleep(1000);
//		WebElement radioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
//		
//		radioButton.isDisplayed();
//		radioButton.isEnabled();
//		radioButton.isSelected();
//		Thread.sleep(3000);
//		radioButton.click();
//		System.out.println(radioButton.isSelected());
		
	