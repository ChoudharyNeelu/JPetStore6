package jpetstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	WebDriver driver;

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Proceed to Checkout")
	WebElement clickingOnCheckout;

	public void proceedToCheckout() {
		clickingOnCheckout.click();
	}

}
