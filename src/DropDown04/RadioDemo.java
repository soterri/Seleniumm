package DropDown04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");

		
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
				
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println(maleRadio.isSelected());

		// 1 way of clicking on element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());
		Thread.sleep(2000);

		String valueToSelect = "Automation Tester";

		List<WebElement> professionList = driver.findElements(By.name("profession"));
		System.out.println(professionList.size());

		for (WebElement profession : professionList) {

//			if(value.equals(valueToSelect)) {
//				profession.click();

			// }

			if (profession.isEnabled()) {
				String value = profession.getAttribute("value");
				System.out.println(value);
				if (value.equals(valueToSelect)) {
					profession.click();
					Thread.sleep(3000);
				}

			}

		}
	}
}