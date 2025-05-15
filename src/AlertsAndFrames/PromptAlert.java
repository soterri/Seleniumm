package AlertsAndFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/alerts";
		
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click on prompt button
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		//handling prompt alert
		Alert alert = driver.switchTo().alert();
		
		String alertText=alert.getText();
		
		if(alertText.equals("Do you like toolsqa?")) {
			alert.sendKeys("yes");
		}
		
		alert.dismiss();
		
		Thread.sleep(5000);
	}

}
