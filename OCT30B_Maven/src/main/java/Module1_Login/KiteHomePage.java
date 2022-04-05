package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class3
public class KiteHomePage
{
	@FindBy(xpath="//span[@class='user-id']")	private WebElement userId;


	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getKiteHomePageUserID() 
	{
		String actUserID = userId.getText();
		return actUserID;
	}
	



}
