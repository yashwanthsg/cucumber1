package ObjectRes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Hook;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(id="source")
	private WebElement txt_src;
	
	@FindBy(id="destination")
	private WebElement txt_dest;
	
	@FindBy(id="datepicker1")
	private WebElement onward_date;
	
	@FindBy(xpath="//a[text()='19']")
	private WebElement onward_clk;
	
	@FindBy(id="datepicker2")
	private WebElement rtn_date;
	
	@FindBy(xpath="//a[text()='19']")
	private WebElement rtn_clk;
	
	@FindBy(xpath="//a[@title='Search Buses']")
	private WebElement btn_search;

	public WebElement getTxt_src() {
		return txt_src;
	}

	public WebElement getTxt_dest() {
		return txt_dest;
	}

	public WebElement getOnward_date() {
		return onward_date;
	}
	
	public WebElement getOnward_clk() {
		return onward_clk;
	}

	public WebElement getReturn_date() {
		return rtn_date;
	}
	public WebElement getReturn_clk() {
		return rtn_clk;
	}
	
	public WebElement getBtn_search() {
		return btn_search;
	}

}



