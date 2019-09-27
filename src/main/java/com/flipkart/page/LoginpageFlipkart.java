package com.flipkart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

public class LoginpageFlipkart extends Base {
	@FindBy(how = How.LINK_TEXT, using = "Login & Signup")
	@CacheLookup
	private WebElement login_button;
	@FindBy(how = How.CSS, using = "input._2zrpKA[type=text]")
	private WebElement username_ele;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	private WebElement password_ele;
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement submit_Button;
	@FindBy(how = How.XPATH, using = "//img[contains(@class,'_1e_EAo')")
	private WebElement flipImage;

	public LoginpageFlipkart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String validateloginPageTile() {
		return driver.getTitle();
	}

	public boolean flipkartImage() {
		return flipImage.isDisplayed();
	}

	public HomePageFlipkar getuserNamePasswor(String un, String Pass) {
		// whenever write HomePageFlipkar return type that user nagigete
		// homepage
		username_ele.sendKeys(un);
		password_ele.sendKeys(Pass);
		submit_Button.click();
		// after login user redirected to homepage.
		return new HomePageFlipkar(driver);
	}

}
