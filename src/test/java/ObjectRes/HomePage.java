package ObjectRes;

import org.openqa.selenium.support.PageFactory;

import bus.Hook;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Hook.driver, this);
	}
}
