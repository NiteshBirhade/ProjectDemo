package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class2
public class KiteLogin2Page 
{
	//declaration
@FindBy(xpath="//input[@id='pin']")	private WebElement pin;
@FindBy(xpath="//button[text()='Continue ']")	private	WebElement cntBtn;
	
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void inpKiteLogin2PagePin(String pinValue) 
	{
		pin.sendKeys(pinValue);
	}
	
	public void clickKiteLogin2PageCntBtn()
	{
		cntBtn.click();
	}

	

}
