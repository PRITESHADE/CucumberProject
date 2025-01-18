package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.cucumber.core.api.Main;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage loginpg;
	public AddNewCustomerPage addNewCustPg;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		loginpg = new LoginPage(driver);
		addNewCustPg = new AddNewCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPassword(password);
		
	}

	@When("Click on Login")
	public void click_on_login() {
		loginpg.clickOnLoginButton();

	}
	//////////////////////Login Feature///////////////////////////////////
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginpg.clickOnLogoutButton();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
	//////////////////////////Add new customer/////////////////////////////////////////////
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		 String actualTitle= addNewCustPg.getPageTitle();
		    String expectedTitle="Dashboard / nopCommerce administration";
		    
		    if(actualTitle.equals(expectedTitle))
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
	    
	}

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() {
		addNewCustPg.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	   addNewCustPg.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	   addNewCustPg.clickOnAddnew();
	}

	@Then("user can view Add new cutomer page")
	public void user_can_view_add_new_cutomer_page() {
		
		String actualTitle= addNewCustPg.getPageTitle();
	    String expectedTitle="Add a new customer / nopCommerce administration";
	    
	    if(actualTitle.equals(expectedTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	   
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		
		addNewCustPg.enterEmail("test1@gmail.com");
		addNewCustPg.enterPassword("test1");
		addNewCustPg.enterFirstName("TestFirstName");
		addNewCustPg.enterLastName("TestLastName");
		addNewCustPg.enterGender("Male");
		addNewCustPg.enterDob("6/13/2022");
		addNewCustPg.enterCompanyName("TestCompanyName");
		
	    
	}

	@When("click on Save button")
	public void click_on_save_button() {
	    addNewCustPg.clickOnSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String expectedConfirmationMessage) {
	    
	}


}
