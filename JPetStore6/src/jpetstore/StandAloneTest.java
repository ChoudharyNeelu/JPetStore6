package jpetstore;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jpetstore.pageobjects.AddingPetsToCart;
import jpetstore.pageobjects.ConfirmationPage;
import jpetstore.pageobjects.PaymentAddressPage;
import jpetstore.pageobjects.ShoppingCart;
import jpetstore.pageobjects.SignIn;

public class StandAloneTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Documents/Neelu/selenium_required_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");

		driver.manage().window().maximize(); // maximizing the screen

		driver.findElement(By.linkText("Enter the Store")).click();

		SignIn signIn = new SignIn(driver);
		signIn.goToLoginPage();
		signIn.login("demo", "demo");

		AddingPetsToCart addingPetsToCart = new AddingPetsToCart(driver);
		addingPetsToCart.dogsSelected();
		addingPetsToCart.ClickingOnAddToCart();

		ShoppingCart shoppingCart = new ShoppingCart(driver);
		shoppingCart.proceedToCheckout();

		PaymentAddressPage paymentAddressPage = new PaymentAddressPage(driver);
		paymentAddressPage.continuePage();

		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		confirmationPage.confirmPage();

		String thankyouMessage = driver
				.findElement(By.xpath("//li[contains(text(),'Thank you, your order has been submitted.')]")).getText();
		Boolean verifyThankYouMessage = thankyouMessage.equalsIgnoreCase("Thank you, your order has been submitted.");

		Assert.assertTrue(verifyThankYouMessage);

		driver.close();

	}

}
