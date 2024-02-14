package EcommercePractice.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EcommercePractice.AbstractComponents.AbstractComponent;

public class SubmitOrderPage extends AbstractComponent {
	
WebDriver driver;
	
	public SubmitOrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(css=".totalRow button")
	WebElement Checkout;
	
	public ConfirmOrderPage clickcheckout()
	{
		Checkout.click();
		return new ConfirmOrderPage(driver);
		
	}

}
