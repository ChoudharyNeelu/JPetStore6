package jpetstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentAddressPage {
	WebDriver driver;

	public PaymentAddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "newOrder")
	WebElement clickOnContinue;

	public void continuePage() {
		clickOnContinue.click();
	}

}
