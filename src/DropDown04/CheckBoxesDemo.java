package DropDown04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CheckBoxesDemo extends CommonMethods {
	
	
	
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.GOOGLE_URL);
		driver.manage().window().maximize();
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='gb_p']"));
		loginBtn.click();
		
		String google=driver.getTitle();
		
		if(google.equals("Google")) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		
	
		
		
	}

}
