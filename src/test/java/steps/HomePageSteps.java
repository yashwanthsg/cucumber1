package steps;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ObjectRes.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	
	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
		HomePage homePage = new HomePage();
		Hook.driver.get("https://www.abhibus.com/");
	}
	@When("The user filling the fields {string}, {string}")
	public void the_user_filling_the_fields(String from, String to) throws Throwable {
		HomePage homePage=new HomePage();
		Robot r=new Robot();
		homePage.getTxt_src().sendKeys(from);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		homePage.getTxt_dest().sendKeys(to);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		homePage.getOnward_date().click();
		homePage.getOnward_clk().click();
		homePage.getReturn_date().click();
		homePage.getReturn_clk().click();
		
	 	}
	@When("The user search the availabity")
	public void the_user_search_the_availabity() throws Throwable {
		HomePage homePage=new HomePage();
		homePage.getBtn_search().click();
		Thread.sleep(2000);
	   
	}
	
	
	
}



