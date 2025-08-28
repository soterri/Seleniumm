package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.CommonnMethods;
import com.utils.ConfigsReader;

public class Calendar extends BaseClass {

	/*
	 * Step 1: Click on calendar Step 2: Get all table data of table using
	 * findElements method Step 3: Using for loop get text of all table data
	 * elements Step 4: Using if else condition we will check specific date Step 5:
	 * If date is matched then click and break the loop
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// login to HRMS application
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		// navigate to leave list
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("leave list")).click();

		// click on the calendar
		driver.findElement(By.id("calFromDate")).click();

		WebElement mDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		CommonnMethods.selectDdValue(mDD, "Apr");

		WebElement yDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		CommonnMethods.selectDdValue(yDD, "2021");

		// select day from the calendar
		CommonnMethods.waitForClickability(driver.findElement(By.id("calFromDate")));
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"));

		for (WebElement fromDate : date) {

			if (fromDate.getText().equals("15")) {
				fromDate.click();
				break;

			}
		}
		tearDown();

	}

}
