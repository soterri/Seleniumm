package CalendarActionJSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonnMethods;
import com.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonnMethods {

	public static void main(String[] args) {

		setUp();

		//identify username based on the parent
		WebElement username = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		//identify password based on the following sibling
		WebElement password = driver.findElement(By.xpath("//span[text()='Passwod']/preceding-sibling::input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		//identify login based on parents sibling
		WebElement loginBtn = driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input"));
		click(loginBtn);
		
		//identify login btn based on grandparent
		WebElement logB = driver.findElement(By.xpath("//form[@id='fromLogin']/div[5]/input"));
		click(logB);
		
		tearDown();
		
		//when to use? only when you cannot identify an element uniquely you'll have to use grandparent, parent, sis, bro
		
	}
}
