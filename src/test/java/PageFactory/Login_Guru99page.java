package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Guru99page {

	WebDriver driver;

	public Login_Guru99page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='uid']")
	WebElement username;

	@FindBy(xpath = "(//input[@name='password'])")
	WebElement password;

	@FindBy(xpath = "(//input[@name='btnLogin'])")
	WebElement Login;

	public void enterUsername(String u_name) {
		username.sendKeys(u_name);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickonLogin() {
		Login.click();
	}
}
