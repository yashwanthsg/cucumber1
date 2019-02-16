package bus;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import ObjectRes.ActionPage;
import cucumber.api.java.en.When;

public class ActionPageSteps {

	@When("The user filling the fields {string}, {string}")
	public void the_user_filling_the_fields(String from, String to) throws Throwable {
		ActionPage actionpage=new ActionPage();
		Robot r=new Robot();
	
		actionpage.getTxt_src().sendKeys(from);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		actionpage.getTxt_dest().sendKeys(to);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		actionpage.getBtn_date().click();
		actionpage.getBtn_clk().click();
		
	 	}
	@When("The user submits the search")
	public void the_user_submits_the_search() throws Throwable {
		ActionPage actionpage=new ActionPage();
		actionpage.getBtn_search().click();
		Thread.sleep(2000);
	   
	}
	
	
	
}



