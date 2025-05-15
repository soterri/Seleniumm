package AlertsAndFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By; //by is a CLASS

import com.utils.CommonMethods;

public class RecapAlert extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "https://demoqa.com/alerts");

		//driver.findElement(By.cssSelector("button[id='alertButton']")).click();
		driver.findElement(By.cssSelector("button[id='alertButton']")).click();

//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println("The text is " + text);
//		alert.accept();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("The text is "+text);
		alert.accept();

		Thread.sleep(4000);
		driver.quit();

	}

}
