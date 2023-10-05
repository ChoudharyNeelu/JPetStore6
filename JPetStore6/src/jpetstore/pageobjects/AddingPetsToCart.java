package jpetstore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingPetsToCart {
	WebDriver driver;

	public AddingPetsToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='SidebarContent']/a[2]/img[1]")
	WebElement selectedDogs;

	@FindBy(xpath = "//a[contains(text(),'Add to Cart')]")
	WebElement addToCart;

	public void dogsSelected() {
		selectedDogs.click();
		driver.findElement(By.linkText("K9-RT-01")).click();
	}

	public void ClickingOnAddToCart() {
		addToCart.click();
	}
}
