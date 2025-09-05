package CalendarActionJSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.BaseClass;

public class ActionClassAmazonDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.setUp();
		
		WebElement account = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
		//hover over the mouse over the menu
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		
		if(element.getText().contains("Start")) {
			System.out.println("Menu displayed");
		}else {
			System.out.println("Menu did not display");
		}
		//how to rightClick on a element
		action.contextClick(element);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//how to double click on a element
		action.moveToElement(searchBox).click().sendKeys("bracelets jade").doubleClick().perform();
		//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movies").perform();
		Thread.sleep(5000);
		BaseClass.tearDown();
	}

}



/*Using ACTIONS class we can automate mouse and keyboard operations
 *1. Build object of the actions class
 *2. Use Methods contentClick = right click
 *				 moveToElement = hover over	
 *				 dragAndDrop
 *3. complete action with .perform(); 	
 */

