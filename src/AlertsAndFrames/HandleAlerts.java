package AlertsAndFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String url = "https://www.rediff.com/";
	
	driver.get(url);
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//click on sign in link
	driver.findElement(By.xpath("//a[@class='signin']")).click();
	
	//click on go button
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	Thread.sleep(2000);
	//handling alert
	Alert alert=driver.switchTo().alert(); //- to handle our javascript alerts - we user interface ALERT we have 4 methods 
	//and before we work with alerts we switch focus of our driver to that alert - once we switch the focus so now we will be working with alert
	//and use the methods
	String getAlertText=alert.getText();
	System.out.println("Text on alert is "+getAlertText);
	
	alert.dismiss();
	
	
}
}
