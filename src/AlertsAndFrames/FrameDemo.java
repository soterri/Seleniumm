package AlertsAndFrames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", "https://demoqa.com/frames");
		WebDriver driver = new ChromeDriver();
		
		String text=driver.findElement(By.xpath("//iframe[@id='frame1']")).getText();
		System.out.println(text);
		
		/*
		 * We can switch to a frame using 3 different methods
		 * 1. by INDEX
		 * by NAME or ID
		 * By WebElement
		 */
		
		//by index
		driver.switchTo().frame(0);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Terri");
		driver.switchTo().defaultContent();//switches back to main window
		Thread.sleep(2000);
		
		//by name or id
		driver.switchTo().frame("");
		name.clear();
		name.sendKeys("John");
		driver.switchTo().defaultContent();
		
		WebElement firstFrame = driver.findElement(By.xpath(""));
		name.clear();
		name.sendKeys("Cam");
		driver.switchTo().defaultContent();
		
	}
}
