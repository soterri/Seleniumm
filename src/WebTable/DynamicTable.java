package WebTable;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class DynamicTable extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
		String expectedValue = "Bob Feather";
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		for(int i=0; i<rows.size(); i++) {
			
			String rowText = rows.get(i).getText();
			
			if(rowText.contains(expectedValue)) {
				driver.findElements(By.xpath("//table[@id='ct100_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}
		}
	}
}
