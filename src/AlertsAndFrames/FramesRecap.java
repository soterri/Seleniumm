package AlertsAndFrames;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FramesRecap extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		boolean isDisplayed = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Pass");
		} else {
			System.out.println("failed");
		}

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
	}
}
