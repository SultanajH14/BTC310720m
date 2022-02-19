package com.bit.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.bit.resource.Utility;

public class UnitTest extends ExtentReportTest {
	//ExtentReports extent;
 // ExtentTest test;
	@Test
	public void terget() {
		 test = extent.createTest("Go to terget.com", "go to serarch");
		Utility u = new Utility(dr);
		u.getAnyurl("https://www.target.com/");
		//test.pass("nevegate to terget");
		u.typeOnAnyElement(By.xpath("//*[@id=\"search\"]"),"");
		//test.pass("enter baby clothes search box");
		u.clickOnAnyElement(By.xpath("//button[text()='go']"));
		
		//test.log(Status.INFO, "This step shows usage of log(status, details)");
		//test.info("This step shows usage of info(details)");

		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		//test.addScreenCaptureFromPath("screenshot.png");
		
	}

	
	 @Test (priority= 1)
	 public void FBook()    { 
		 test = extent.createTest("Go to FaceBook.com", "Do sign in");
			Utility u = new Utility(dr);
			u.getAnyurl("https://www.facebook.com/");
			u.typeOnAnyElement(By.name("email"), "adkj235@yahoocom");
			u.typeOnAnyElement(By.name("pass"), "ssdgf344");
			u.clickOnAnyElement(By.name("login"));
			u.getTextOnElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
			//try {
				//test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	     //} catch (IOException e) {
				
				//e.printStackTrace();
			//}

			//try {
				//test.addScreenCaptureFromPath("screenshot.png");
			//} catch (IOException e) {
				
				//e.printStackTrace();
			//}
		 }
	 

}