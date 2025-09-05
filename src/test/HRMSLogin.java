package test;

import com.syntax.pages.LoginPage;
import com.utils.CommonnMethods;
import com.utils.ConfigsReader;

public class HRMSLogin extends CommonnMethods{
	public static void main(String[] args) {
		
		//test case: as an admin should be able to login using valid credentials
		setUp();
		
		LoginPage login = new LoginPage();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		wait(5);
		tearDown();
		
		
		
	}

}
