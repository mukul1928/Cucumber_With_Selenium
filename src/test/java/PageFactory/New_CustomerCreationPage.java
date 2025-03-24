package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_CustomerCreationPage {
	
	WebDriver driver;
	
	public New_CustomerCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="New Customer")
	WebElement newCustomer;
	
	@FindBy(xpath="(//input[@name='name'])")
	WebElement customername;
	
	@FindBy(xpath="(//input[@value='m'])")
	WebElement gender;
	
	@FindBy (xpath="(//textarea[@name='addr'])")
	WebElement Address;
	
	
	public void clickonNewCustomerLink()
	{
		newCustomer.click();
	}
	
	public void enterCustomerName(String name)
	{
		newCustomer.sendKeys(name);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void enterAddress(String address)
	{
		Address.sendKeys(address);
	}
	
	
}
