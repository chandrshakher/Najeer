package com.flipkart.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

import com.flip.qa.utils.UitlityTest;

public class HomePageFlipkar extends Base {
	
	@FindBy(how = How.XPATH, using = "//img[@title='Flipkart']")
	@CacheLookup
	private WebElement flipkartlogo;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Electronics')]")
	private WebElement electronic;
	@FindBy(how = How.XPATH, using = "//div[@class='_3zdbog _3Ed3Ub']//li[@class='_2GG4xt']//ul[@class='QPOmNK']//li")
	private List<WebElement> dynam_elemnt_apple;
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Apple")  private WebElement apple; 
	@FindBy(how = How.XPATH, using = "//img[contains(@class,'_1e_EAo')")
	private WebElement flipImage;

	public HomePageFlipkar() {
		PageFactory.initElements(driver, this);
	}

	public void validatIem(){
		// mouse hover
		UitlityTest.mouseHover(electronic);
	}

	public ApplePageflipkart clickonhomeApple() {
		for(int i=0; i<dynam_elemnt_apple.size(); i++){
			      if(dynam_elemnt_apple.get(i).getText().contains("Apple")){
			    	  apple.click();       
			    	         
			      }
			
		}
		
		// click on this icon then new page is open like apple
			/*for (WebElement any : dynam_elemnt_apple) {
			String items = any.getText();
			  if(items.contains("Apple")){
				       any.click();
				       
			  }
		}
		*/

		return new ApplePageflipkart();
	}

	public SamsungPage clickSamsung() {
		return new SamsungPage();
	}
}
