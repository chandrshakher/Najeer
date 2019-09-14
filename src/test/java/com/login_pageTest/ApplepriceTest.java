package com.login_pageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flip.qa.Base.Base;
import com.flipkart.page.AppleStore;
import com.flipkart.page.ApplepricePage;
import com.flipkart.page.HomePageFlipkar;
import com.flipkart.page.LoginpageFlipkart;

public class ApplepriceTest extends Base{
	LoginpageFlipkart LoginpageFlipkart;
	HomePageFlipkar  homePageFlipkar;
	AppleStore   applestore;
	ApplepricePage applepricePage; 
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException{
		    initilaize();
		    LoginpageFlipkart=new LoginpageFlipkart();
		    homePageFlipkar= LoginpageFlipkart.getuserNamePasswor(prop.getProperty("username"), prop.getProperty("password"));
		    Thread.sleep(2000);
		    homePageFlipkar.menuIcon();
		   // Thread.sleep(2000);
		    homePageFlipkar.clickonhomeApple();
		    Thread.sleep(2000);
		    applestore=new AppleStore(); 
		    applepricePage=applestore.appleitemName();
	}
	@Test
	public  void  verifyApplePrice() throws InterruptedException{
		Thread.sleep(2000);
		applepricePage.clikonAppleSerie();
	}
	
	
	
}
