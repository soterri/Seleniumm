package AlertsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultipleWindows extends CommonMethods	{

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", "syntax site");
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		driver.findElement(By.linkText("Like us on Facebook")).click();
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		
		Iterator<String> it = allWindows.iterator();
		
		while(it.hasNext()) {
			String child=it.next();
			if(!child.equals(mainWindow)){
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
				
			}
		}
	}
}
