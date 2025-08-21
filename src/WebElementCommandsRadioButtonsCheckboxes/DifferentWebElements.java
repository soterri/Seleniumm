package WebElementCommandsRadioButtonsCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWebElements {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * test case: manually go to toolsqa.com -> demo sites -> automation practice
		 * form http://toolsqa.com/automation-practice-form/ perform action on all links
		 * and text boxes using different locators click on checkboxes, radiobuttons,
		 * select values from drop down
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Terri");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Meu");
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Max");
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("lastName")).clear();

		// to reduce redundancy in coding - as above filling in first name and than
		// clearing and than sending keys again use code below
		// driver.findElement returns 1 element store inside obj variable - obj
		// variable will be holding firstname txtbox
		WebElement txFName = driver.findElement(By.id("firstName"));// method returns - returns an element - returns
																	// webelement
		WebElement txLastName = driver.findElement(By.id("lastName"));
		txFName.sendKeys("Sophy");
		txLastName.sendKeys("Meuan");
		txFName.clear();
		txFName.sendKeys("Sav");
		txFName.clear();
		txFName.sendKeys("Cameron");
		txLastName.clear();
		txLastName.sendKeys("Meu");
		txFName.clear();

		Thread.sleep(2000);

		// click on radio button

		// 1 way
		// driver.findElement(By.xpath("//input[@'gender']")).click();

		// 2nd way
		// driver.findElement(By.xpath("//input[@name='gender'][@value='Female']")).click();

		// 3 way
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

		radio.size(); // returns 9 elementd
		// radio.get(1).click();
//		String value = radio.get(0).getAttribute("value");
		//System.out.println(value);

		for (int i = 0; i <= radio.size(); i++) {
			
			String value = radio.get(0).getAttribute("value");
			
			if(value.equalsIgnoreCase("Male")) {
				
				radio.get(i).click();
			}
		}
		

	}
}
