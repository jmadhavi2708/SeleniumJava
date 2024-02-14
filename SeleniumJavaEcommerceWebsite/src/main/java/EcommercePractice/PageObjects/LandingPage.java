package EcommercePractice.PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EcommercePractice.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}


	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginbtn;
	
	public void gotourl()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	
	public  ProductCatelogPage firstpage(String userid,String passwrd)
	{
		username.sendKeys(userid);
	
		
		password.click();
		password.sendKeys(passwrd);

		loginbtn.click();
		return new  ProductCatelogPage(driver);
	}
	
	public void close()
	{
		driver.close();
	}
	
	
	}
	
	



