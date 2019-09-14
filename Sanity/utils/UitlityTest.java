package com.flip.qa.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flip.qa.Base.Base;

public class UitlityTest extends Base {

	public static int Page_Load_Timeout = 10;
	public static int Implicit_Wait = 20;

	public UitlityTest() {
		super();
	}

	public static void mouseHover(WebElement ele) {
		Actions acts = new Actions(driver);
		acts.moveToElement(ele).build().perform();
		acts.click();
	}
	public static void doClick(WebElement eel){
		      eel.click();
	}
	public void switchToFrame(){
		driver.switchTo().frame("nameshould");
	}
	
}
