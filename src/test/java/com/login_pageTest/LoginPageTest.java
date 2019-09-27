package com.login_pageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flip.qa.Base.Base;
import com.flipkart.page.LoginpageFlipkart;
import com.flipkart.page.HomePageFlipkar;

public class LoginPageTest extends Base {
	//HomePageFlipkar homePageFlipkar;
	LoginpageFlipkart loginpageFlipkart;
// no need create constructore 
/*	
public LoginPageTest() {
		// testcase ka constructor hai.
	super();
		
	} */ 

	@BeforeMethod
	public void setup() {
		// driver initilize
		initilaize();
		// we make object LoginpageFlipkart
		loginpageFlipkart = new LoginpageFlipkart(driver);

	}

	@Test
	public void loginTest() {
		// 1 user lagin with valid credential then it will navigate home page.
       
		loginpageFlipkart.getuserNamePasswor(
				prop.getProperty("username"), prop.getProperty("password"));

	}
}
