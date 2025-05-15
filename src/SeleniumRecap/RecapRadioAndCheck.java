package SeleniumRecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RecapRadioAndCheck extends CommonMethods {

	public static void main(String[] args) {

		CommonMethods.setUp("chrome", "https://demoqa.com/checkbox");
		WebElement btn = driver.findElement(By.cssSelector("svg[class*='rct-icon-uncheck']"));
		btn.click();

		List<WebElement> allCheckBoxes = driver.findElements(By.xpath(""));
		
		for(WebElement e:allCheckBoxes) {
			String text = e.getAttribute("value");
			
			if(text.equals("Selenium WebDriver")) {
				e.click();
				break;
			}

		}

		driver.quit();
	}

}

//// handle a group of radio or checkboxes
//List<WebElement> allCheckBoxes = driver.findElements(By.xpath(""));
//// validating each checkbox is clickable - use for loop
//for (WebElement e : allCheckBoxes) {
//	// String text=e.getText(); we can also use getAttribute();
//	String text = e.getAttribute("value");
//	if (text.equals("Selenium Webdriver")) {
//		e.click();
//		break;