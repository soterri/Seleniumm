package WebElementCommandsRadioButtonsCheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		//clicking on radio button using List and for loop
		List<WebElement> proList = driver.findElements(By.cssSelector("label[for='hobbies-checkbox-1']"));
		
		int size = proList.size();
		System.out.println("Size of checkboxes are: "+size);
		
		String valueToBeSelected = "Sports";
		
		for(WebElement hobbies:proList) {
			
			if(hobbies.isEnabled()) {
				String value = hobbies.getAttribute("class"); //class is attribute name in the DOM
				System.out.println(value);
			
				if(value.equals(valueToBeSelected)) {
					hobbies.click();
					break;
				}
				
			}
			
		}
		driver.close();
	}

}
