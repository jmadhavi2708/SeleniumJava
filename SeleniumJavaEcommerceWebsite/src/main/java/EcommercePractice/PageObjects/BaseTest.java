package EcommercePractice.PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class BaseTest  {

	public static void main(String[] args)
	{
	
		String Productname= "ZARA COAT 3";
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		LandingPage landingPage = new LandingPage(driver);
	
	     landingPage.gotourl();
	 	ProductCatelogPage productCatelog =  landingPage.firstpage("jmadhaviqatest@gmail.com", "Password@123");
		List<WebElement> products = productCatelog.getProductList();
	 	productCatelog.addProductToCart(Productname);
	 	SubmitOrderPage submitOrder =productCatelog.goToCartPage();
	 	ConfirmOrderPage confirmOrder = submitOrder.clickcheckout();
	 	confirmOrder.country("india");
	 	CheckOutPage checkout=confirmOrder.submitorder();
	 	String confirmmessage = checkout.confirmationmessage();
	 	Assert.assertTrue(confirmmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
	 	driver.close();
	
	 	
	 	

	
	 	
	 	
			 
			 
	    

	}

}