package Com_ActiTime_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_ActiTime_Generic.BasePage;

public class ActiTimeEnterTiemTrackPage extends BasePage {
	//Declaration
	@FindBy(id = "logoutLink")
	private WebElement ltBT;
	
	//Initailiation
	
	public ActiTimeEnterTiemTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//declaration
	
	public void logoutButton()
	{
		ltBT.click();
	
}

}
