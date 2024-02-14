package EcommercePractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EcommercePractice.AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {
	
	
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		
		super (driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css=".hero-primary")
	WebElement confirmmsg;
	
	public String confirmationmessage()
	{
		return confirmmsg.getText();
	}

}
