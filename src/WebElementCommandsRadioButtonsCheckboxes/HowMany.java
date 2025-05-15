package WebElementCommandsRadioButtonsCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowMany {

	public static void main(String[] args) {
		
		//go to walmart and get # of links and print only links that have texts
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://www.walmart.com/");
		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println("the link size is "+links.size());
//		
//		int count = 0;
//		for(WebElement link: links) {
//			String linkText=link.getText();
//			
//			if(!linkText.isEmpty()) {
//				System.out.println(linkText);
//				count++;
//			}
//		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The link size is "+links.size());
		
		int count = 0;
		
		for(WebElement link: links) {
			String linkText = link.getText();
			
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("total number of links with texts "+count);
		driver.quit();

	}
}

/*to find the list/links of elements - use the method FIND ELEMENTS and specify the tag name
 * and findelements is going to return you a web elements list.
 */
