package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class TestCaseTable extends BaseClass {

	/*
	 * Delete Employee 1. Open chrome brower 2. Go to http://syntax site that I dont
	 * have access too 3. Login into the application 4. Add Employee 5. Verify
	 * employee has been added 6. Go to employee list 7.Delete added employee 8.
	 * Quit the browser
	 */

	public static void main(String[] args) {

		setUp();

		// login to HRMS application
		driver.findElement(By.id("txtUserName")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		// Navigate to add Employee page
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();

		// add employee
		String firstName = "Terri";
		String lastName = "Thach";
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);

		// grab the employee ID for later use
		driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

		String empDetails = driver.findElement(By.id("profile-pic")).getText();

		if (empDetails.equals(firstName + " " + lastName)) {
			System.out.println("Employee was added");
		} else {
			System.out.println("Not added");
		}

		driver.findElement(By.linkText("Employee List")).click();

		// define flag variable
		boolean found = false;

		while (!found) {

			List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));

			for (int i = 0; i < tableRows.size(); i++) {

				String rowsText = tableRows.get(i).getText();

				if (rowsText.contains(empDetails)) {
					found = true;

					// delete the employee
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1)")).click();

					driver.findElement(By.id("btnDelete")).click();

					driver.findElement(By.id("dialogueDeleteBtn")).click();
					break;

				}
			}
			driver.findElement(By.xpath("//a[text()='Next']")).click();

		}
	}
}
