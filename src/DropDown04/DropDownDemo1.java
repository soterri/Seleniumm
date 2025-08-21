package DropDown04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) {

		setUp();
		WebElement weekDD = driver.findElement(By.id("select-demo"));

		Select select = new Select(weekDD);

		List<WebElement> options = select.getOptions();
		System.out.println("# of operations in the DD is " + options.size());
		// select.selectByIndex(3);

		for (int i = 1; i < options.size(); i++) {
			select.selectByIndex(i);

			tearDown();

			/*
			 * Selenium provides 3 different ways to select a value from a dropdown 1.
			 * byIndex();
			 */

		}

	}
}