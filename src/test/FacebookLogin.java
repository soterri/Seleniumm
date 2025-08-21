package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonnMethods;

public class FacebookLogin extends CommonnMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement monthDD = driver.findElement(By.id("month")); //object of the DD
		Select select = new Select(monthDD); //building object of select class
		select.selectByVisibleText("Jun"); 
		
		//calling method and selecting by inde
		selectDdValue(monthDD, 3);
		String show=monthDD.getText();
		System.out.println(show);
		
		WebElement dayDD = driver.findElement(By.id("day"));
		selectDdValue(dayDD, 2);
		
		WebElement yearDD = driver.findElement(By.id("year"));
		selectDdValue(yearDD, "5"); //method that shows the visible text
		
		Thread.sleep(2000);
		
		tearDown();
		
		
		
	}

}
