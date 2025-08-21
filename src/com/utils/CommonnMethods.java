package com.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class CommonnMethods extends BaseClass {

	/**
	 * Method that clears and send keys
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Method checks if radio button/checkboxes is enabled and clicks
	 * 
	 * @param radioOrCheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String value) {

		String actualValue;

		for (WebElement ele : radioOrCheckbox) {

			actualValue = ele.getAttribute("value").trim();
			if (ele.isEnabled() && actualValue.equals(value)) {
				ele.click();
				break;
			}

		}
	}

	public static void selectDdValue(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (WebElement op : options) {
				if (op.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}

			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method that selects values by index
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDdValue(WebElement element, int index) {

		try {
			Select select = new Select(element);
			// List<WebElement>options=select.getOptions();
			int size = select.getOptions().size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void acceptAlert() {
		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}
	}
	public static String getAlertText() {
		
		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText=alert.getText();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
			
		}
		return alertText;
	
	}
}

