package com.flip.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flip.qa.utils.UitlityTest;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fs;

	public Base() {
		try {
			// properties get
			prop = new Properties();
			// file load hua
			fs = new FileInputStream(
"E://Yadav Selenium//CSYadavProjectwebdrive//Nazeer//src//main//java//com//flip//qa//configration//config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initilaize() {
		// call browser
		String browser1 = prop.getProperty("browser");
	 if (driver == null && browser1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//RJ//Downloads//chromedriver.exe");
			driver = new ChromeDriver();
		}
	 driver.manage().window().maximize();
	 // driver.manage().timeouts().pageLoadTimeout(UitlityTest.Page_Load_Timeout, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(UitlityTest.Implicit_Wait, TimeUnit.SECONDS);
	   driver.get(prop.getProperty("url"));
	      
		  
		
	}
}
