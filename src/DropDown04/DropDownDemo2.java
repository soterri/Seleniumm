package DropDown04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		
		WebElement state = driver.findElement(By.cssSelector("div[class=' css-tlfecz-indicatorContainer']"));
		
		Select select = new Select(state);
		
		List<WebElement>options=select.getOptions();
		
		for(WebElement option:options) {
			
			String text = option.getText();
			System.out.println(text);
			
			if(text.equals("Virginia")) {
				option.click();
				select.selectByVisibleText("Arlington");
				String texts=option.getText();
				
				if(texts.equals("Virginia")) {
					System.out.println("VA is selected" +option.isSelected());
				}else {
					System.out.println("VA is not selected");
				}
			}
			boolean isMultiple = select.isMultiple();
			System.out.println(isMultiple);
		
			tearDown();
		}
		
		
	}

}
