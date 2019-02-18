package steps;


import ObjectRes.SearchBusPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SearchBusPageSteps {
	
	@Then("The availabity results got")
	public void the_availabity_results_got() throws Throwable {
		SearchBusPage searchbuspage=new SearchBusPage();
		Assert.assertTrue(searchbuspage.getIs_disp().isDisplayed());
	}
	

}
