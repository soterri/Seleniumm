package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemo {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("syntax url that I dont have access to");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());

		System.out.println("----row data----");
		Iterator<WebElement> it = rows.iterator();

		while (it.hasNext()) {
			String rowText = it.next().getText();

		}
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of columns: " + cols.size());

		for (WebElement col : cols) {
			String colText = col.getText();
			System.out.println(colText);
		}
		driver.close();
		//working with static data
	}

}
