package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class1
public class KiteLogin1Page
{
	//step1: declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;     //private WebElement UN=driver.findElement(By.xpath(""))
	@FindBy(xpath="//input[@id='password']")	private WebElement pwd;  //private WebElement pwd=driver.findElement(By.xpath(""))
	@FindBy(xpath="//button[text()='Login ']")	private WebElement loginBtn; //private WebElement loginBtn=driver.findElement(By.xpath(""))
	

	public	KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inpKiteLogin1PageUsername(String unValue) 
	{
		UN.sendKeys(unValue);
	}
	
	public void inpKiteLogin1PagePassword(String pwdValue) 
	{
		pwd.sendKeys(pwdValue);
	}
	
	public void clickKiteLogin1PageLoginBtn()
	{
		loginBtn.click();
	}
	
	
	

}
