package CommandsClass05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {

	public static final String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		// THIS METHOD IS OPENING GOOGLE WEBSITE USING CHROME BROWSER
		CommonMethods.setUp("chrome", url);

		// FIND THE ELEMENT INPUT FORM AND CLICK ON IT
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		// FIND THE ELEMENT SELECT DROPDOWN LIST AND CLICK ON IT
		driver.findElement(By.xpath("//select[@id='month']")).click();

		// finding the element and storing it in a variable DD
		WebElement DD = driver.findElement(By.xpath("//select[@id='day']"));

		// to work with drop downs, if the tag name starts with select then we have to
		// create an obj of select class.
		Select select = new Select(DD);

		select.selectByIndex(3);

		// selecting by value attribute
		//select.selectByValue("value");

		// selecting by visible text
		select.selectByVisibleText("3");

		// how to get the count of a drop items? use the select. get options - returns a
		// list of web element - each item present in a drop down is considered a
		// webelement.
		List<WebElement> options = select.getOptions();

		System.out.println(options.size());
		// storing the list of options in iterator so we can loop through
		Iterator<WebElement> it = options.iterator();
		while (it.hasNext()) {
			it.next().click();
			Thread.sleep(1000);

		}
	}
}