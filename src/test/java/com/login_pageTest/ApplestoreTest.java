package com.login_pageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flip.qa.Base.Base;
import com.flipkart.page.AppleStore;
import com.flipkart.page.ApplepricePage;
import com.flipkart.page.HomePageFlipkar;
import com.flipkart.page.LoginpageFlipkart;

public class ApplestoreTest extends Base {
	LoginpageFlipkart loginpageFlipkart;
	AppleStore applestore;
	HomePageFlipkar homePageFlipkar;
	ApplepricePage applepricePage;

	/*ApplepageTest() {
		super();
	}*/

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initilaize();
	     loginpageFlipkart = new LoginpageFlipkart();
		homePageFlipkar = loginpageFlipkart.getuserNamePasswor(
				prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		//click on menue of homepage
		homePageFlipkar.menuIcon();
		
		System.out.println("applestore");
		//Thread.sleep(2000);
	}

	@Test
	public void verify() throws InterruptedException {
		// clik on apple iphone 4s on apple page.
		applestore = homePageFlipkar.clickonhomeApple();
		applestore.appleitemName(); 
		System.out.println("verify");
		
	

	}
}
