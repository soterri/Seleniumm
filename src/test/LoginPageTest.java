package test;

import com.syntax.pages.DashboardPageElement;
import com.syntax.pages.LoginPageElements;
import com.utils.CommonnMethods;
import com.utils.ConfigsReader;

public class LoginPageTest extends CommonnMethods{
	
	public static void main(String[] args) {
		
		setUp();
		
		LoginPageElements login = new LoginPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.buttonLogin);
		
		DashboardPageElement dashboard = new DashboardPageElement();
		if(dashboard.equals("Welcome")) {
			System.out.println("Welcome is displayed");
		}else {
			System.out.println("Not displayed");
		}
		
	}
	

}
