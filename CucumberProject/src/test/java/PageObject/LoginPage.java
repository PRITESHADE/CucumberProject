package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver lDriver;
	
	public LoginPage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement LogoutBtn;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		Password.clear();
		Password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	
	public void clickOnLogoutButton()
	{
		LogoutBtn.click();
	}
	
	/*
	 * public void clickOnLogOutButton() { logout.click(); }
	 */
	
	
	

}
