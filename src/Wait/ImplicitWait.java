package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class ImplicitWait {

	public static void main(String[] args) {

		CommonMethods.setUp("chrome", "https://www.google.com");
		WebDriver driver = new ChromeDriver();
		driver.get("");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.linkText("")).click();

		String text = driver.findElement(By.className("")).getText();
		System.out.println(text);

	}

}
