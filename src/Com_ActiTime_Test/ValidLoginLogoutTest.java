package Com_ActiTime_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Page.ActiTimeEnterTiemTrackPage;
import Com_ActiTime_Page.actiTimeLoginPage; 



public class ValidLoginLogoutTest extends BaseTest{
	

	@Test
	public void ValidLoginLogout()
	{
		
	
	actiTimeLoginPage lp = new actiTimeLoginPage(driver);
	ActiTimeEnterTiemTrackPage et = new ActiTimeEnterTiemTrackPage(driver);
			lp.verifyTitle("actiTIME - Login");
			
	lp.enterUserName("admin");
	lp.enterPassword("manager");
	lp.login();
	lp.verifyTitle("actiTIME - Enter Time-Track");
	et.logoutButton();

	}
}
