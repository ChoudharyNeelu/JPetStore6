package jpetstore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn<Webdriver> {

	WebDriver driver;

	public SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement userpassword;

	@FindBy(name = "signon")
	WebElement login;

	public void goToLoginPage() {
		driver.findElement(By.linkText("Sign In")).click();
	}

	public void login(String uname, String upassword) {
		username.sendKeys(uname);
		userpassword.clear();
		userpassword.sendKeys(upassword);
		login.click();
	}

}
