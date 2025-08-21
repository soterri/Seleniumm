package DropDown04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class MultiSelectDD {

	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.setUp();
		WebElement multiSelectDD=driver.findElement(By.id(""));
		
		Select select = new Select(multiSelectDD);
		
		boolean isMultiple=select.isMultiple();
		System.out.println("This DD is multi select "+isMultiple);
		
		if(isMultiple) {
			select.selectByIndex(0);
			select.selectByVisibleText("");
			
			select.deselectAll();
		}
		
		
		
	}
}
