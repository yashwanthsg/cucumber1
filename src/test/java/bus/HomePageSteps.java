package bus;

import ObjectRes.HomePage;
import cucumber.api.java.en.Given;	

public class HomePageSteps {


	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
		HomePage homepage = new HomePage();
		Hook.driver.get("https://www.abhibus.com/");
	}

}
