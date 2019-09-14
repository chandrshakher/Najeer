package com.flipkart.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

public class ApplePageflipkart extends Base{
	 //how=How.XPATH, using="//div[@class='_2tnqd0 _1_l8MX']//img[@alt='Iphone Xs']/.
	 @FindBy(how=How.XPATH, using="(//*//img[@class='_2VeolH _3I5S6S'])[3]")
	 private WebElement iphonme; 
	 
	public ApplePageflipkart(){
		PageFactory.initElements(driver, this);
	}
	public void clikonIphone(){
	int x = iphonme.getLocation().getX();
	int y = iphonme.getLocation().getY();
	System.out.println(y);
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,"+y+")");		   
		    //js.executeScript("window.scrollBy(0,1000)");
		      
		    iphonme.click();
		  //   return new ApplepricePage();
	}
	
}
