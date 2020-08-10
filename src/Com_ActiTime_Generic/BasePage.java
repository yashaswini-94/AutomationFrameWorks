package Com_ActiTime_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("The Tiltle is matching:" + title, true);
			
		}
		
		catch(Exception e)
		{
			Reporter.log("The title is not-matching:", true);
			Reporter.log("Actual tile:"+driver.getTitle(), true);
			Assert.fail();
		}
		
	}
public void verifyElement(WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("The element is present:" , true);
	}
	catch(Exception e)
	{
		Reporter.log("The element is no-present" , true);
		Assert.fail();
	}
}
}
