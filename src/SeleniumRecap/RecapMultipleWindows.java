package SeleniumRecap;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapMultipleWindows extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", "https://demoqa.com/browser-windows");
		String mainWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		//how to identify the window - getWindowHandles();
		//ID parent and child with iterator
		//switch
		
		Set<String> allWindows=driver.getWindowHandles(); //will return collection of SET of string - bc of the IDs will be unique 
		Iterator<String> stringIt=allWindows.iterator();
		String parent = stringIt.next();
		System.out.println(parent);
		String child = stringIt.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
