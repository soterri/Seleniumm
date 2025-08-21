package 
AlertsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class WindowHandles extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "https://demoqa.com/browser-windows");
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

		// 1. get windowHandles();
		// identify parent & child
		//switch

		Set<String> allWindows = driver.getWindowHandles(); // returns a collection - SET - returns set bc ID will be
															// unique - set of String

		Iterator<String> it = allWindows.iterator();

		String parent = it.next();
		System.out.println(parent);
		String child = it.next();
		System.out.println(child);

		driver.switchTo().window(child);
		String childTitle = driver.getTitle();
		System.out.println(childTitle);

		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
