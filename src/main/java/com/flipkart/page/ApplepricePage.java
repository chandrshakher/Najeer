package com.flipkart.page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

public class ApplepricePage extends Base {
	public ApplepricePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Apple iPhone 8 Plus (Silver, 64 GB)')]")
	WebElement appleiphoneser;
	// button[@class='_2AkmmA _2Npkh4 _2MWPVK']
	@FindBy(how = How.XPATH, using = "button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addcart;
    
	public void clikonAppleSerie() throws InterruptedException {
		// it is normal click
		appleiphoneser.click();
		String parent = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow.size());
		for (String multwindow : childwindow) {
			if (!parent.equals(multwindow)) {
				driver.switchTo().window(multwindow);
				
				appleiphoneser.click();
				addcart.click();
				System.out.println("parent");
			} 
			else {
				 parent.equals(childwindow);
				 driver.switchTo().window(multwindow);
					appleiphoneser.click();
					addcart.click();
               System.out.println("child");
					// driver.switchTo().window(parent);
					//appleiphoneser.click();
			}

		}

	}
}
