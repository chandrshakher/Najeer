package com.qa.ExtentRepot;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
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
             extentHtmlReporter=new ExtentHtmlReporter("./myownreport.html");
            	 extentReports=new ExtentReports();
            	 extentReports.attachReporter(extentHtmlReporter);
              }
              // after method or afterclass
	public void capturedscreenshot(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			extentTest.fail(MarkupHelper.createLabel(result.getName()+"Yadav testcasefaild: ", ExtentColor.RED));
			extentTest.fail(result.getThrowable());
		}
		else if(ITestResult.SUCCESS==result.getStatus()){
			extentTest.pass(MarkupHelper.createLabel(result.getName()+"Yadav Pass testcase:", ExtentColor.GREEN));
			
		
		}
		else{
			extentTest.skip(MarkupHelper.createLabel(result.getName()+"yada skip", ExtentColor.YELLOW));
		      extentTest.skip(result.getThrowable());
		}
		
	}
	public void aftersuite(){
		extentReports.flush();
	}
	
}
