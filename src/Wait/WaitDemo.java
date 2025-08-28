package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class WaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.cssSelector("div#checkbox")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement goneText = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		String text = goneText.getText();
		System.out.println(text);

		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		WebElement itsBack = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		System.out.println(itsBack.getText());
		
		
		// String text = driver.findElement(By.id("message")).getText();
//		System.out.println(text);

		tearDown();

	}

}
