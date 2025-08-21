package AlertsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles6 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://www.google.com/&dsh=S1426309014:1755125935596456&ec=futura_exp_og_so_72776762_e&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=AdBytiOZVTG-ENNXvbOL9iwyMlZsfc8vSucdMsi7mFMr2afGhUpZ4J64V6940ALee_m0oGpxt-rkYg&TL=ALgCv6yhtmWscFu2dW3YRSTLTRPS0DNQffJGgD5o4yLL6ee-tAv_Ud9dHpLnXM5C");
		
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Terri");
		
		driver.findElement(By.linkText("Help")).click();
		
		String getTitle = driver.getTitle();
		System.out.println("Title is "+getTitle);

		String getURL= driver.getCurrentUrl();
		System.out.println("Current URL "+getURL);
		
		Set<String> allWindowhandles=driver.getWindowHandles();
		//Returns a set of String IDs of all current opened windows by the current instance
		System.out.println("Number of windows open are "+ allWindowhandles.size());
		
		Iterator<String>it = allWindowhandles.iterator();
		String mainWindowHandle=it.next();
		System.out.println("ID of Main window - "+mainWindowHandle);
		String childWindowHandle=it.next();
		System.out.println("ID of child window - "+childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		
		String childWindowHandleTitle = driver.getTitle();
		System.out.println(childWindowHandleTitle);
		
		
		
		
		
		if(getTitle.equals("Create your Google Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("does not pass");
		}
		
		/*
		 * How to get window handle?
		 * In Selenium, there are 2 methods
		 * getWindowHandle();
		 * getWindowHandles();
		 */
		
		
	}
}
