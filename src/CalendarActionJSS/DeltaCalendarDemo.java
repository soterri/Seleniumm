package CalendarActionJSS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class DeltaCalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		setUp();
//
//		// Open the calendar
//		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
//
//		// Accept cookies popup (HTML element, not JS alert)
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
//
//		// Retrieve current month
//		String departMonth = driver.findElement(By.cssSelector("span[class='dl-datepicker-month-0']")).getText();
//
//		// Loop until October appears, with a safety limit
//		int maxTries = 12; // prevents infinite loop
//		while (!departMonth.equals("October") && maxTries > 0) {
//			driver.findElement(By.xpath("//a[@class='dl-datepicker-1']")).click();
//			Thread.sleep(3000); // wait for calendar to update
//			departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
//			maxTries--;
//		}
//
//		if (departMonth.equals("October")) {
//			System.out.println("Reached October ✅");
//		} else {
//			System.out.println("October not found ❌");
//
//		}
//	}
//}

		setUp();

//		// opening the calendar
//		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
//
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
//
//		// retrieving the element text (month) in this case and store it into a string
//		// variable
//		String departMonth = driver.findElement(By.xpath("//span[class='dl-datepicker-month-0']")).getText();
//
//		while (!departMonth.equals("October")) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			Thread.sleep(2000);
//			departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
//
//		}
//
//		// loop through td and grab text
//		List<WebElement> departCells = driver.findElements(By.xpath("//tbody[@class='d1-datepicker-tbody-0']/tr/td"));
//
//		for (WebElement deCell : departCells) {
//			String fromText = deCell.getText();
//			if (fromText.equals("15")) {
//				deCell.click();
//				break;
//			}
//
//		}
//
//		// grab the text of return and check if its equal to october
//		String returnMonth = driver.findElement(By.xpath("//span[@class='d1-datepicker-month-1']")).getText();
//
//		while (!returnMonth.equals("October")) {
//
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			Thread.sleep(2000);
//			returnMonth = driver.findElement(By.xpath("//span[@class='d1-datepicker-month-1']")).getText();
//
//		}
//
//		List<WebElement> departReturnCell = driver
//				.findElements(By.xpath("//tbody[@class='d1-datepicker-tbody-1']/tr/td"));
//
//		for (WebElement returnCells : departReturnCell) {
//
//			String returnText = returnCells.getText();
//			if (returnText.equals("9")) {
//				returnCells.click();
//
//			}
//		}
//
//		driver.findElement(By.xpath("//button[@value='done']")).click();
//		Thread.sleep(5000);
//		tearDown();
		
		// open departure calendar
		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

		// accept cookies (if present)
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

		// wait for departure month
		WebDriverWait wait = new WebDriverWait(driver, 5);
		String departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-2']")).getText();

		// loop until October appears in departure
		while (!departMonth.equals("October")) {
		    driver.findElement(By.xpath("//span[text()='Next']")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='dl-datepicker-month-0']")));
		    departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}

		// select 15th for departure
		List<WebElement> departCells = driver.findElements(By.xpath("//tbody[@class='d1-datepicker-tbody-0']/tr/td"));
		for (WebElement deCell : departCells) {
		    if (deCell.getText().equals("15")) {
		        deCell.click();
		        break;
		    }
		}

		// check return month
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();

		// loop until October for return
		while (!returnMonth.equals("October")) {
		    driver.findElement(By.xpath("//span[text()='Next']")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='d1-datepicker-month-1']")));
		    returnMonth = driver.findElement(By.xpath("//span[@class='d1-datepicker-month-1']")).getText();
		}

		// select 9th for return
		List<WebElement> returnCells = driver.findElements(By.xpath("//tbody[@class='d1-datepicker-tbody-1']/tr/td"));
		for (WebElement reCell : returnCells) {
		    if (reCell.getText().equals("9")) {
		        reCell.click();
		        break;
		    }
		}

		// click Done
		driver.findElement(By.xpath("//button[@value='done']")).click();

	}
}
