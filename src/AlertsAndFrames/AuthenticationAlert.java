package AlertsAndFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//cant use a real auto site for safety ex:http://abcdatabse.com
		
		//to login with a pop up w/o even seeing the login pahe
		driver.get("http://test:test:@abcdatabase.com/basicauth");
		
		
		
	}
}
