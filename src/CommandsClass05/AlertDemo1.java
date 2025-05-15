package CommandsClass05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo1 extends CommonMethods{
	
	public static final String SYNTAX_PRACTICE_URL ="";
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", "");
		Thread.sleep(2000);
		
		//find the element Alerts and Modals and clicking on it
		//driver.findElement(By.linkText("Alerts & Models")).click();
		driver.findElement(By.xpath("//a[href='#' and text()='Alerts & Modals']")).click();
		
		//finding Javascript alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		//finding the button and click on it
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction']")).click();
		
		//sending text to alert box
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Terri");
		
		alert.accept();
		boolean isDisplayed = driver.findElement(By.id("prompt-demo")).isDisplayed();
		System.out.println(isDisplayed);
		
		driver.close();
		
	}

}
