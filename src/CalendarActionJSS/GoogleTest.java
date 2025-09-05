package CalendarActionJSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.utils.CommonnMethods;

public class GoogleTest extends CommonnMethods{
	
	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.className("gLFyf")).sendKeys("iphone");
		wait(5);
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		wait(5);
		tearDown();
	}

}
