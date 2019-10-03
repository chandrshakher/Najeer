package com.qa.ExtentRepot;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.flip.qa.Base.Base;

public class Extentreporttest extends Base{
              ExtentHtmlReporter extentHtmlReporter;
              ExtentReports extentReports;
              ExtentTest extentTest;
            
              //ITestResult result;
              // befiore suite before any anotation
              public Extentreporttest(WebDriver driver){
            	 super(); 
           
              }
              public void startReport(){
             extentHtmlReporter=new ExtentHtmlReporter(new File("E://Yadav Selenium//CSYadavProjectwebdrive//Nazeer//Reports//learnreports.html"));
            	 extentReports=new ExtentReports();
            	 extentReports.attachReporter(extentHtmlReporter);
            	 extentTest=extentReports.createTest("my frist Test", "Sample Test");
            	 extentTest.log(Status.INFO, "Login to Flipkar");
              }
              // after method or afterclass
	public void capturedscreenshot(ITestResult result){
		System.out.println("bhim sir"+result);
		System.out.println("bhim sir"+result.getStatus());
		if(ITestResult.FAILURE==result.getStatus()){
			// tackescreenshot
			System.out.println("bhim sir fail:"+result.getStatus()+"yada:"+extentTest);
			extentTest.fail(MarkupHelper.createLabel(result.getName()+"Yadav testcasefaild: ", ExtentColor.RED));
			System.out.println("bhim sir markup:"+result.getStatus());
			extentTest.fail(result.getThrowable());
			System.out.println("bhim sir throwable:"+result.getStatus());
		}
		else if(ITestResult.SUCCESS==result.getStatus()){
			System.out.println("bhim sir success:"+result.getStatus());
			extentTest.pass(MarkupHelper.createLabel(result.getName()+"Yadav Pass testcase:", ExtentColor.GREEN));
			
		
		}
		else{
			System.out.println("bhim sir skip"+result.getStatus());
			extentTest.skip(MarkupHelper.createLabel(result.getName()+"yada skip", ExtentColor.YELLOW));
		      extentTest.skip(result.getThrowable());
		}
		
	}
	public void aftersuite(){
		extentReports.flush();
	}
	
}
