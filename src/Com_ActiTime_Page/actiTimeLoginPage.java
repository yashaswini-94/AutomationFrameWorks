package Com_ActiTime_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_ActiTime_Generic.BasePage;

public class actiTimeLoginPage extends BasePage{
	//Declaration
	@FindBy(id = "username")
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;	
	@FindBy(xpath = "//div[.='Login ']")
WebElement lgBT;
@FindBy(xpath = "//span[.='Username or Password is invalid. Please try again.']")
private WebElement errorMessage;
@FindBy (xpath= "//nobr[.='actiTIME 2020 Online']")
private WebElement version;

//Initialization
public actiTimeLoginPage(WebDriver driver)
{
super(driver);
PageFactory.initElements(driver, this);

}

//utilization

public void enterUserName(String name) 
{
	unTB.sendKeys(name);
}

public void enterPassword(String password)
{
	pwTB.sendKeys(password);
}
public void login()
{
	lgBT.click();
}

public String errorMessage()
{
	verifyElement(errorMessage);
	String aErrorMessage = errorMessage.getText();
	return aErrorMessage;
}

//verify the Version	
public String verifyVersion()	
{	
	verifyElement(version);
	String aVersion = version.getText();
	return aVersion;
}	



}



