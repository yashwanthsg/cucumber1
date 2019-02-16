package bus;

import ObjectRes.AccessPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class AccessPageSteps {
	
	@Then("The availabity results got")
	public void the_availabity_results_got() throws Throwable {
		AccessPage accesspage=new AccessPage();
		Assert.assertTrue(accesspage.getIs_disp().isDisplayed());
	}
	

}
