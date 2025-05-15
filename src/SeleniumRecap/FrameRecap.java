package SeleniumRecap;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FrameRecap extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", "https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		boolean isDisplayed=driver.findElement(By.xpath("//iframe[@id='frame1']")).isDisplayed();
		
		if(isDisplayed) {
			System.out.println("passes");
		}else {
			System.out.println("fails");
		}
	}
}
