package SeleniumRecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", "https://www.ebay.com/");
		WebElement dd = driver.findElement(By.cssSelector("select[id='gh-cat']")); // select#gh-cat

		Select obj = new Select(dd); // in the constructor must pass the obj of select type

		List<WebElement> options = obj.getOptions();
		//obj.selectByVisibleText("Music");
		//boolean isSelected = false;
		for (WebElement option : options) {
			String text = option.getText();

			if (text.equals("Music")) {
				obj.selectByVisibleText(text);
				//isSelected=true;
				break;
			}
		}
		driver.quit();
	}

}

// getting all options
//List<WebElement> options = obj.getOptions();

//validates each option is clickable
//for (WebElement option : options) {
//	option.click();