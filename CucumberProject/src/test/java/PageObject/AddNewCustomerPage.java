package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {

	WebDriver lDriver;

	public AddNewCustomerPage(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Find web elements on the web page
	@FindBy(xpath = "//a[@href=\"#\"]//p[contains(text(),'Customers')]")
	WebElement lnkCustomers_menu;

	@FindBy(xpath = "//a[@href=\"/Admin/Customer/List\"]//p[contains(text(),'Customers')]")
	WebElement lnkCustomers_menuitem;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnAddnew;

	@FindBy(xpath = "//input[@name='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@name='LastName']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='Gender_Male']")
	WebElement MaleGender;

	@FindBy(xpath = "//input[@id='Gender_Female']")
	WebElement FemaleGender;

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtDob;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtCompany;

	@FindBy(xpath = "//input[@id='IsTaxExempt']")
	WebElement chkIsTaxExempt;

	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement txtNewsletter;

	@FindBy(xpath = "//li[@id=\"select2-SelectedNewsletterSubscriptionStoreIds-result-002z-1\"]")
	WebElement txtYourStoreName;

	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/span/span[1]/span/ul")
	WebElement txtCustomerRole;

	@FindBy(xpath = "//select[@id=\"VendorId\"]")
	WebElement txtvendor;

	@FindBy(xpath = "//*[@id=\"VendorId\"]/option[1	]")
	WebElement optvendor1;

	@FindBy(xpath = "//*[@id=\"VendorId\"]/option[2]")
	WebElement optvendor2;

	@FindBy(xpath = "//textarea[@class=\"form-control\"]")
	WebElement txtcomment;

	@FindBy(xpath = "//button[@name=\"save\"]")
	WebElement btnSave;

	
	 @FindBy(xpath= "//input[@aria-controls=\"select2-SelectedCustomerRoleIds-results\"]")
	 WebElement dropdown;
	 
		/*
		 * @FindBy(xpath="//*[@id=\"select2-SelectedCustomerRoleIds-result-ofq2-4\"]")
		 * WebElement Customer_roles;
		 */
	 
	 	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/span/span[1]/span")
	 	WebElement Customer_roles;
	  
	 	
	 
	 	
	 	
	 public void selectopt(String opt) {
	  
	 Select select = new Select(dropdown); 
	 select.selectByValue(opt);
	 
	  
	 }
	 

	public String getPageTitle() {
		return lDriver.getTitle();
	}

	public void clickOnCustomersMenu() {
		lnkCustomers_menu.click();
	}

	public void clickOnCustomersMenuItem() {
		lnkCustomers_menuitem.click();
	}

	public void clickOnAddnew() {
		btnAddnew.click();
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void enterFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}

	public void enterDob(String dob) {
		txtDob.sendKeys(dob);
	}

	public void enterCompanyName(String coName) {
		txtCompany.sendKeys(coName);
	}

	public void selectCustomer_roles() {
		
	}
	/*
	 * public void enterAdminContent(String content) {
	 * txtAdminContent.sendKeys(content); }
	 */

	/*
	 * public void enterCustomerRoles(String role) {
	 * 
	 * }
	 */

	public void enterManagerOfVendor(String value) {
		Select drp = new Select(txtvendor);
		drp.selectByVisibleText(value);
	}

	public void enterGender(String gender) {
		if (gender.equals("Male")) {
			MaleGender.click();
		} else if (gender.equals("Female")) {
			FemaleGender.click();
		} else// default set Male gender
		{
			MaleGender.click();
		}

	}

	public void clickOnSave() {
		btnSave.click();
	}

	public void roleSelect()
 	{
 		Customer_roles.click();
 		Customer_roles.findElement(By.id("select2-SelectedCustomerRoleIds-result-m4d3-2")).click();
 	}	
	

}
