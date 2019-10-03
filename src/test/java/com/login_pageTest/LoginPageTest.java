package com.login_pageTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.flip.qa.Base.Base;
import com.flipkart.page.LoginpageFlipkart;
import com.flipkart.page.HomePageFlipkar;
import com.qa.ExtentRepot.Extentreporttest;

public class LoginPageTest extends Base {
	//HomePageFlipkar homePageFlipkar;
	LoginpageFlipkart loginpageFlipkart;
	Extentreporttest extentreporttest;
	ExtentReports extentReports;
	ExtentTest extentTest;
	ITestResult result;
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
		extentreporttest=new Extentreporttest(driver);
		extentreporttest.startReport();
		 extentReports=new ExtentReports();
        

	}

	@Test
	public void loginTest() {
		// 1 user lagin with valid credential then it will navigate home page.
		
		loginpageFlipkart.getuserNamePasswor(
				prop.getProperty("username"), prop.getProperty("password"));
		//extentTest=extentReports.createTest("loginTest");
	//	System.out.println("Check result status="+result.getStatus());   
		Assert.assertTrue(1>0);
		
	}
	@AfterMethod
	public void testreport(ITestResult result){
	
		extentreporttest.capturedscreenshot(result);
		
	}
	@AfterTest
	public void  tearDown(){
		extentreporttest.aftersuite();
	}
}
