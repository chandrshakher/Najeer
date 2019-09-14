package com.flipkart.page;

import org.openqa.selenium.support.PageFactory;

import com.flip.qa.Base.Base;

public class ApplepricePage extends Base{
	public ApplepricePage(){
		 PageFactory.initElements(driver, this);
	}
	
}
