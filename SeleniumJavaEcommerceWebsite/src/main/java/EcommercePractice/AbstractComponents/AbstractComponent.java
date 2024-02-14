package EcommercePractice.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import EcommercePractice.PageObjects.SubmitOrderPage;

public class AbstractComponent {
	
	WebDriver driver;
	

	@FindBy(css="routerlink*='cart'")
	WebElement addToCart;
	
	
	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
       PageFactory.initElements(driver,this);
		
		
	}

	public void waitForElementToAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForElementToDisappear(WebElement ele)
	{
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public SubmitOrderPage goToCartPage()
	{
		addToCart.click();
	 return new SubmitOrderPage(driver);
		
	}
	

}
