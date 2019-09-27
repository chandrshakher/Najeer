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
	@BeforeMethod
	public void setup() throws InterruptedException{
		    initilaize();
		    LoginpageFlipkart=new LoginpageFlipkart(driver);
		    Thread.sleep(2000);
		    // get user name password
		    homePageFlipkar= LoginpageFlipkart.getuserNamePasswor(prop.getProperty("username"), prop.getProperty("password"));
		    Thread.sleep(2000);
		    //click on menu electronics
		    homePageFlipkar.menuIcon();
		  
		    // click on apple item
		    homePageFlipkar.clickonhomeApple();
		    Thread.sleep(2000);
		    applestore=new AppleStore(driver); 
		    //scroll and clik.
		    applepricePage=applestore.appleitemName();
	}
	@Test
	public  void  verifyApplePrice() throws InterruptedException{
		
		applepricePage.clikonAppleSerie();
	}
	
	
	
}
