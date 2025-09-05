package CalendarActionJSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmericanAirlineCalendar {

	public static void main(String[] args) {
		
	}
}
		/*
		 * Test Case 1 - Calendar headers and rows verification
		 * Open Chrome browser
		 * Go to https://www.aa.come/homePage
		 * Enter From and To Select departure as July 14, 2026
		 * Select Arrival as November 8, 2026
		 * Close Browser
		 
		
		for(WebElement cell:depCells) {
			String cellText = cell.getText();
			
			if(cellText.equals("14")) {
				cell.click();
				flag = true;
				break;
			}
		}
	}else {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	}
	Thread.sleep(200);
}

flag = false;
while(!flag) {
	String rMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")).getText();
	if(rMonth.equals("October 2026")) {
		
		List<WebElement> returnCells = driver.findElements(By.xpath("//div[contains(@class, 'ui-corner-left')]))
	}
}
		*/
		