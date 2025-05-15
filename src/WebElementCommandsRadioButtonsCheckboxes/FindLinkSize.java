package WebElementCommandsRadioButtonsCheckboxes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkSize {
	public static void main(String[] args) {

		/*
		 * open Chrome browser go to https://www.amazon.com/ using iterator get text of
		 * each link get number of links that has text
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		// capture all links
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//
//		int count = 0;
//		
//		Iterator<WebElement> itLinks = links.iterator();
//		while (itLinks.hasNext()) {
//
//			String linkText = itLinks.next().getText();
//
//			if (!linkText.isEmpty()) {
//				System.out.println(linkText);
//				count++;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int count = 0;
		Iterator<WebElement> itLinks = links.iterator();
		
		while(itLinks.hasNext()) {
			
			String linkText = itLinks.next().getText();
			
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count ++;
		
	}
		}System.out.println("Total number of links with text is "+count);
		driver.close();}

}
