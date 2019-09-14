package com.flipkart.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

public class AppleStore extends Base {
	// how=How.XPATH, using="//div[@class='_2tnqd0 _1_l8MX']//img[@alt='Iphone
	// Xs']/.
	@FindBy(how = How.XPATH, using = "//div[2]//div[1]//div[1]//a[1]//div[1]//img[2]")
	// @FindBy(how=How.XPATH, using="(//*//img[@class='_2VeolH _3I5S6S'])[3]")
	private WebElement iphonme;
	
	public AppleStore() {
		
		PageFactory.initElements(driver, this);
		
	}

	public ApplepricePage appleitemName() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		iphonme.click();
		return new ApplepricePage();
	}

}
