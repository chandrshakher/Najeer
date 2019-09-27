package com.login_pageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flip.qa.Base.Base;
import com.flip.qa.utils.UitlityTest;
import com.flipkart.page.AppleStore;
import com.flipkart.page.HomePageFlipkar;
import com.flipkart.page.LoginpageFlipkart;

public class HomePageflipTest extends Base {
	LoginpageFlipkart login;
	HomePageFlipkar homefl_page;
	UitlityTest genric_util;
	AppleStore applestore;

	/*
	 * HomePageflipTest(){ super(); }
	 */
	@BeforeMethod
	public void setUp() throws InterruptedException {
		// inilization page
		initilaize();
		// crete obejct loginpage
		login = new LoginpageFlipkart(driver);
		// get user name password.
		homefl_page = login.getuserNamePasswor(prop.getProperty("username"),
				prop.getProperty("password"));
		// genric_util=new UitlityTest();
		//Thread.sleep(3000);
	}

	@Test
	public void verifyHomepgae() {
		
		// after clicking on
		homefl_page.menuIcon();
		applestore = homefl_page.clickonhomeApple();
	}

}
