package EcommercePractice.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EcommercePractice.AbstractComponents.AbstractComponent;

public class ConfirmOrderPage extends AbstractComponent {

	WebDriver driver;
	public ConfirmOrderPage(WebDriver driver) {
		
		super (driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement selectcountry;
	
	@FindBy(css=".action__submit")
	WebElement submit;
	
	@FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
	WebElement countrynames;
	
   By results= By.cssSelector(".ta-results");
	
	
	public void country(String countryname)
	{
	Actions a = new Actions(driver);
	a.sendKeys(selectcountry, countryname).build().perform();
	waitForElementToAppear(results);
	countrynames.click();
	
	}
	
	public CheckOutPage submitorder() {
		
		submit.click();
		return new CheckOutPage(driver);
	}

}
