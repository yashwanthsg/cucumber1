package ObjectRes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Hook;

public class SearchBusPage {

	public SearchBusPage() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(xpath="//div[@class='topHeader wrap']")
	private WebElement is_disp;
	
	public WebElement getIs_disp() {
		return is_disp;
		
	}
	
}
