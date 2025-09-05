package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class ScreenShotDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		// login to HRMS app
		driver.findElement(By.name("txtUerName")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.className("button")).click();

		Thread.sleep(2000);

		// create an object of interface takesScreenShot() and cast the webdriver with
		// it
		TakesScreenshot ts = (TakesScreenshot) driver;

		// use getScreenShot as method to take the screenshot(in the constructor pass
		// Type.FILE
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		// copy the file from source to another destination
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("screenshot was not taken");
		}

	}
}
