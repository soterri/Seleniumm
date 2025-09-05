package CalendarActionJSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class JavaScriptExecutorDemo extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		WebElement pass =driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.className("button"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.backgroundColor='red'", pass);
		
		//click on login button using JS
		js.executeScript("arguments[0].click", loginBtn);
		
		js.executeScript("window.scrollBy(0, 150)");
	}

}
